package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Oleg","Olegov",(byte) 25);
        userService.saveUser("Maks","Maksimov",(byte) 26);
        userService.saveUser("Roman","Romanov",(byte) 27);
        userService.saveUser("Sergey","Sergeev",(byte) 28);
        List<User> userList = userService.getAllUsers();
        for (User user:userList) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
