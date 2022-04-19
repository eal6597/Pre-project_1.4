package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;

/**
 *         Алгоритм работы приложения:
 *
 *         В методе main класса Main должны происходить следующие операции:
 *
 *  Создание таблицы User(ов)
 *  Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль
 *  (User с именем – name добавлен в базу данных)
 *  Получение всех User из базы и вывод в консоль (должен быть переопределен toString в классе User)
 *  Очистка таблицы User(ов)
 *  Удаление таблицы
 */

public class Main {

    private final static UserService userService = new UserServiceImpl();

    public static void main (String[] args) {

        userService.createUsersTable();

        userService.saveUser("Владимир", "Путин", (byte) 69);
        userService.saveUser("Джо", "Байден", (byte) 79);
        userService.saveUser("Александр", "Лукашенко", (byte) 67);
        userService.saveUser("Си", "Цзиньпин", (byte) 68);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.removeUserById(1);
        userService.dropUsersTable(); // реализуйте алгоритм здесь
    }
}