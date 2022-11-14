package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:postgresql://localhost:5432/users_dtbs";
    private static final String USER = "User";
    private static final String PASS = "Sabotage971";
    private static final String DRIVER = "org.postgresql.Driver";
    private static Connection connection = null;
    public Util() {}
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Подключение к таблице - успешно");
        }
        catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }
        return connection;

    }
}


