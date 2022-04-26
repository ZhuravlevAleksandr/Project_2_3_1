package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(final int id);
    void addUser(User user);
    void updateUser(int id, User updatedUser);
    void removeUser(int id);
}
