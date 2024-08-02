package Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            System.out.println("Connection established!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}