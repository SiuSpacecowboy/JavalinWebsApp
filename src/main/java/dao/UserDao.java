package dao;

import dto.User;

import java.util.List;

public interface UserDao {

    public Long save(User user);

    public List<User> getUsers();

    public User findUserById(Long id);

    public void editUser(User user, Long id);

    public void deleteUser(Long id);
}
