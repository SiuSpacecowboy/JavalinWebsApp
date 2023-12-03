package controllers;

import dao.UserDao;
import dto.User;
import dto.UserPage;
import dto.UserPageWithErrors;
import helpfulClasses.Capital;
import helpfulClasses.Secure;
import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import util.NameRoutes;

import java.util.Collections;

public class CreateUserController {

    public static final UserDao UserDao = MainController.getUserDao();

    public static void buildUser(Context ctx) {
        UserPageWithErrors errors = new UserPageWithErrors();
        ctx.render("forms/new-user.jte", Collections.singletonMap("errors", errors));
    }

    public static void postBuildUser(Context ctx) {
        String firstName = ctx.formParam("firstname").toLowerCase();
        firstName = Capital.capitalNames(firstName);
        String lastName = ctx.formParam("lastname").toLowerCase();
        lastName = Capital.capitalNames(lastName);
        String email = ctx.formParam("email").toLowerCase().trim();
        String confirmPassword = ctx.formParam("confirm");
        try {
            String password = ctx.formParamAsClass("password", String.class)
                    .check(v -> v.equals(confirmPassword), "Passwords must be the same.")
                    .get();
            password = Secure.encrypt(password);
            String token = Secure.generateToken();
            User user = new User(firstName, lastName, email, password, token);
            Long id = UserDao.save(user);
            ctx.sessionAttribute("flash","Creation success");
            ctx.cookie("token", token);
           /* ctx.redirect(NameRoutes.oneUserPath(String.valueOf(id)));*/
            ctx.redirect(NameRoutes.startPath());
        } catch (ValidationException e) {
            UserPageWithErrors errors = new UserPageWithErrors(firstName, lastName, email, e.getErrors());
            ctx.sessionAttribute("flash","Wrong password!");
            errors.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.status(422);
            ctx.render("forms/new-user.jte", Collections.singletonMap("errors", errors));
        }
    }

    public static void getOneUser(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        User tryUser = UserDao.findUserById(id);
        if (tryUser != null && tryUser.getToken().equals(ctx.cookie("token"))) {
            UserPage page = new UserPage(tryUser);
            page.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.render("users/user.jte", Collections.singletonMap("page", page));
        } else if (tryUser == null) {
            ctx.status(404);
            ctx.render("errors/not-found.jte");
        } else if (!tryUser.getToken().equals(ctx.cookie("token"))) {
            ctx.render("errors/bad-token.jte");
        }
    }
}


