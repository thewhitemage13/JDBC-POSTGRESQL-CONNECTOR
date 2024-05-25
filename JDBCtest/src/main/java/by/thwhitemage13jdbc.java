package by;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class thwhitemage13jdbc {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            // URL-адрес подключения к базе данных (замените на свой URL)
            String url = "jdbc:postgresql://localhost:5432/postgres";

            // Имя пользователя и пароль для доступа к базе данных (замените на свои)
            String username = "postgres";
            String password = "root";

            // Устанавливаем соединение
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection.getTransactionIsolation());

            if (connection != null) {
                System.out.println("Успешное подключение к базе данных SQL Server!");
                // Здесь можно выполнять операции с базой данных
            } else {
                System.out.println("Не удалось подключиться к базе данных.");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных.");
            e.printStackTrace();
        } finally {
            // Закрываем соединение в блоке finally, чтобы освободить ресурсы
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Соединение с базой данных закрыто.");
                }
            } catch (SQLException e) {
                System.out.println("Ошибка при закрытии соединения.");
                e.printStackTrace();
            }
        }
    }

}
