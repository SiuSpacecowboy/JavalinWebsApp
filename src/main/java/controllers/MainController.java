package controllers;

import dao.UserDao;
import dao.UserDaoNoDb;
import dao.UserDaoDb;
import dto.User;
import dto.UserPage;
import dto.UsersPage;
import io.javalin.http.Context;
import java.util.Collections;
import java.util.List;

public class MainController {

/*    private static final UserDao userDao = new UserDaoNoDb();*/ /**Если хотите проверить код, без базы данных,
     раскомментируйте данную строчку и закомментируйте строчку ниже**/
    private static final UserDao userDao = new UserDaoDb();

    public static void startPage(Context ctx) {
        var page = new UserPage(ctx.sessionAttribute("user"));
        page.setFlash(ctx.consumeSessionAttribute("flash"));
        ctx.render("start/start-page.jte", Collections.singletonMap("page", page));
    }

    public static void pages(Context ctx) {
        var page = ctx.queryParamAsClass("page", Long.class)
                .getOrDefault(1L);
        long supPage = 1L;
        if (page > 1) {
            supPage = page;
        }
        long firstUser = (supPage - 1) * 5;
        long lastUser = supPage * 5;
        long finalPage = 1;
        boolean haveUsers = !userDao.getUsers().isEmpty();
        if (haveUsers) {
            long arrayFinalUser = userDao.getUsers().get(userDao.getUsers().size() - 1).getId();
            finalPage = arrayFinalUser <= 5 ? 1 : (long) Math.ceil((double) arrayFinalUser / 5);
        }
        List<User> res = userDao.getUsers().stream()
                .skip(firstUser)
                .limit(lastUser)
                .toList();
        UsersPage users = new UsersPage(res, page, finalPage, haveUsers);
        ctx.render("users/users-list.jte", Collections.singletonMap("users", users));
    }

    public static UserDao getUserDao() {
        return userDao;
    }
}
