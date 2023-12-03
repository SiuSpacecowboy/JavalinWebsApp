import controllers.*;
import io.javalin.Javalin;
import util.NameRoutes;

public class Init {

    public static void main(String[] args) {
            Javalin app = Javalin.create(config -> {
                config.plugins.enableDevLogging();
            });
            app.get(NameRoutes.allUsersPath(), MainController::pages);
            app.get(NameRoutes.buildUserPath(), CreateUserController::buildUser);
            app.get(NameRoutes.oneUserPath("{id}"), CreateUserController::getOneUser);
            app.get(NameRoutes.editUserPath("{id}"), EditUserController::editUser);
            app.get(NameRoutes.startPath(), MainController::startPage);
            app.get(NameRoutes.buildSessionsPath(), SessionUserController::sessionBuildUser);
            app.post(NameRoutes.allUsersPath(), CreateUserController::postBuildUser);
            app.post(NameRoutes.oneUserPath("{id}"), EditUserController::postEditUser);
            app.post(NameRoutes.sessionsPath(), SessionUserController::sessionCreateUser);
            app.post(NameRoutes.sessionsDeletePath(), SessionUserController::sessionDestroyUser);
            app.post(NameRoutes.userDeletePath("{id}"), DeleteUserController::deleteUser);
            app.start(8080);
    }
}
