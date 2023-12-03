package controllers;

import dao.UserDao;
import dto.UserEditPageWithErrors;
import dto.User;
import helpfulClasses.Capital;
import helpfulClasses.Secure;
import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import util.NameRoutes;
import java.util.Collections;

public class EditUserController {

    public static final UserDao UserDao = MainController.getUserDao();

    public static void editUser(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        User user = UserDao.findUserById(id);
        if (user != null && user.getToken().equals(ctx.cookie("token"))) {
            UserEditPageWithErrors errors =
                    new UserEditPageWithErrors(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                            user.getPassword(), user.getToken());
            ctx.render("forms/edit.jte", Collections.singletonMap("errors", errors));
        } else if (user == null) {
            ctx.status(404);
            ctx.render("errors/not-found.jte");
        } else if (!user.getToken().equals(ctx.cookie("token"))) {
            ctx.render("errors/bad-token.jte");
        }
    }

    public static void postEditUser(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        String firstName = ctx.formParam("firstname").toLowerCase();
        firstName = Capital.capitalNames(firstName);
        String lastName = ctx.formParam("lastname").toLowerCase();
        lastName = Capital.capitalNames(lastName);
        String email = ctx.formParam("email").toLowerCase().trim();
        String confirmPassword = ctx.formParam("confirm");
        String password = ctx.formParam("password");
        String token = ctx.formParam("token");
        try {
            String finalConfirmPassword = Secure.encrypt(confirmPassword);
            ctx.formParamAsClass("password", String.class)
                    .check(v -> v.equals(finalConfirmPassword) || v.equals(confirmPassword), "Passwords must be the same")
                    .get();
            ctx.formParamAsClass("firstname", String.class)
                    .check(v -> v.length() > 1, "Is too short name")
                    .get();
            ctx.formParamAsClass("lastname", String.class)
                    .check(v -> v.length() > 1, "Is too short surname")
                    .get();
            ctx.formParamAsClass("email", String.class)
                    .check(v -> v.contains("."), "Wrong style email")
                    .get();
            User user = new User(firstName, lastName, email, password, token);
            UserDao.editUser(user, id);
            ctx.sessionAttribute("flash","Edit success");
            ctx.redirect(NameRoutes.oneUserPath(String.valueOf(id)));
        } catch (ValidationException e) {
            UserEditPageWithErrors errors = new UserEditPageWithErrors(id, firstName, lastName, email, password, token, e.getErrors());
            ctx.status(422);
            ctx.sessionAttribute("flash", "Wrong data!");
            errors.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.render("forms/edit.jte", Collections.singletonMap("errors", errors));
        }
    }
}
