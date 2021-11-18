package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBCImpl = new UserDaoJDBCImpl();
        userDaoJDBCImpl.createUsersTable();
        userDaoJDBCImpl.saveUser("Александр","Канивец", (byte) 27);
        userDaoJDBCImpl.saveUser("Пётр","Иванов", (byte) 20);
        userDaoJDBCImpl.saveUser("Иван","Петров", (byte) 25);
        userDaoJDBCImpl.saveUser("Николай","Сидорв", (byte) 23);
        userDaoJDBCImpl.removeUserById(4);
        userDaoJDBCImpl.getAllUsers();
        userDaoJDBCImpl.cleanUsersTable();
        userDaoJDBCImpl.dropUsersTable();
    }
}
