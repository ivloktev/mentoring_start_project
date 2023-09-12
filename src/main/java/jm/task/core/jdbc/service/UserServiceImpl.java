package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class UserServiceImpl implements UserService {
    private static final String URL = "jdbc:mysql://localhost:3306/business";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "springcourse";
    private static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            Statement statement = connection.createStatement();
            String saveTheUserInTable = "INSERT INTO Users VALUES(" + 1 + ", '" + name + "'" + ", '" + lastName + "' " +
                    age + ")";
            statement.executeUpdate(saveTheUserInTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;

    }

    public void cleanUsersTable() {

    }
}
