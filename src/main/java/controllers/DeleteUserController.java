package controllers;

import dao.UserDao;
import dto.User;
import io.javalin.http.Context;
import util.NameRoutes;

public class DeleteUserController {

    private static final UserDao UserDao = MainController.getUserDao();

    public static void deleteUser(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        User user = UserDao.findUserById(id);
        String name = "User";
        if (user != null) {
            name = user.getFirstName();
        }
        if (user != null && user.getToken().equals(ctx.cookie("token"))) {
            UserDao.deleteUser(id);
            SessionUserController.sessionDestroyUser(ctx);
            ctx.sessionAttribute("flash", name + " was successfully deleted!");
            ctx.redirect(NameRoutes.startPath());
        } else if (user == null) {
            ctx.status(404);
            ctx.render("errors/not-found.jte");
        } else if (!user.getToken().equals(ctx.cookie("token"))) {
            ctx.render("errors/bad-token.jte");
        }
    }
}
