package Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Connection connection = null;


        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            String query = "UPDATE users SET email = ? WHERE name = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "newemail@example.com");
            preparedStatement.setString(2, "John Doe");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
