package controllers;

import dao.UserDao;
import dto.User;
import helpfulClasses.Secure;
import io.javalin.http.Context;

import java.util.Collections;

public class SessionUserController {

    private static final UserDao UserDao = MainController.getUserDao();

    public static void sessionBuildUser(Context ctx) {
        User user = new User();
        ctx.render("forms/log-in.jte", Collections.singletonMap("user", user));
    }

    public static void sessionCreateUser(Context ctx) {
        var name = ctx.formParam("firstname");
        var password = ctx.formParam("password");
        String finalPassword = Secure.encrypt(password);
        User res = UserDao.getUsers().stream()
                .filter(v -> v.getFirstName().equals(name))
                .filter(v -> v.getPassword().equals(finalPassword) || v.getToken().equals(password))
                .findFirst()
                .orElse(null);
        System.out.println(res);
        if (res == null) {
            User user = new User();
            user.setFirstName(name);
            ctx.sessionAttribute("flash", "Wrong data!");
            user.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.render("forms/log-in.jte", Collections.singletonMap("user", user));
        } else {
            ctx.cookie("token", res.getToken());
            ctx.sessionAttribute("user", res); /** Можно добавлять в сессию value не только String, как это утверждается **/
            ctx.sessionAttribute("flash", "Logged in successfully");
            ctx.redirect("/");
        }
    }

    public static void sessionDestroyUser(Context ctx) {
        ctx.sessionAttribute("user", null);
        ctx.sessionAttribute("idk", null);
        ctx.redirect("/");
    }
}
