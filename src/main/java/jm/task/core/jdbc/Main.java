package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        // 1. Установить MySQL Server + WorkBench локально
        User newUser = new User();
        newUser.setAge(Byte.valueOf("30"));
        newUser.setName("First Name");
        newUser.setLastName("Last Name");
        newUser.setId(1L);
        // 2. Создать подключение к базе данных из приложения
        // и прописать ниже логику сохранения newUser в базу данных
        UserServiceImpl userService = new UserServiceImpl();
        userService.saveUser("Nike", "Petrov", (byte) 12);
        //конечный результат:
        //при запуске этого метода в пустой базе данных появляется новый пользователь

    }
}
