package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(final int id);
    void addUser(User user);
    void updateUser(int id, User updatedUser);
    void removeUser(int id);
}
