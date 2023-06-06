package jm.task.core.jdbc.repository;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserRepository {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
