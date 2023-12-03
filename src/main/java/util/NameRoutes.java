package util;

public class NameRoutes {

    public static String startPath() {
        return "/";
    }

    public static String allUsersPath() {
        return "/users";
    }

    public static String oneUserPath(String id) {
        return "/users/" + id;
    }

    public static String buildUserPath() {
        return "/users/build";
    }

    public static String editUserPath(String id) {
        return "/users/" + id + "/edit-user";
    }

    public static String sessionsPath() {
        return "/sessions";
    }

    public static String buildSessionsPath() {
        return "/sessions/build";
    }

    public static String sessionsDeletePath() {
        return "/sessions/delete";
    }

    public static String userDeletePath(String id) {
        return "/users/" + id + "/delete";
    }
}
