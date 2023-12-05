package dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import dto.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoDb implements UserDao{

    private static Long ID = 0L;
    private static final HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;
    private static final String URL = "jdbc:mysql://localhost:3306/app";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private static Connection connection;

  /*  static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    static {
        config.setJdbcUrl(URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource(config);
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Long save(User user) {
        try {
            PreparedStatement prep = connection.prepareStatement("INSERT INTO users(firstName, lastName, email, pass, token)" +
                    " VALUES(?, ?, ?, ?, ?)");
            System.out.println(user.getPassword());
            prep.setString(1, user.getFirstName());
            prep.setString(2, user.getLastName());
            prep.setString(3, user.getEmail());
            prep.setString(4, user.getPassword());
            prep.setString(5, user.getToken());
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(ID);
        return ++ID;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        String SQL = "SELECT * FROM users";
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(SQL);
            while (result.next()) {
                User user = new User();
                user.setId(result.getLong("id"));
                user.setFirstName(result.getString("firstName"));
                user.setLastName(result.getString("lastName"));
                user.setEmail(result.getString("email"));
                user.setPassword(result.getString("pass"));
                user.setToken(result.getString("token"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public User findUserById(Long id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            user = new User(resultSet.getLong("id"), resultSet.getString("firstName"),
                    resultSet.getString("lastName"), resultSet.getString("email"),
                    resultSet.getString("pass"), resultSet.getString("token"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void editUser(User user, Long id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE users SET firstName = ?, lastName = ?, email = ?, pass = ?, token = ? WHERE id = ?");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getToken());
            preparedStatement.setLong(6, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(Long id) {
        User user = findUserById(id);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
