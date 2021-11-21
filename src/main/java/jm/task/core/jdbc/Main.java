package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Александр","Канивец", (byte) 27);
        userService.saveUser("Пётр","Иванов", (byte) 20);
        userService.saveUser("Иван","Петров", (byte) 25);
        userService.saveUser("Николай","Сидорв", (byte) 23);
        userService.removeUserById(4);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
