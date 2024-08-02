package Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            connection.setAutoCommit(false);
            String query = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Alice");
            preparedStatement.setString(2, "alice@example.com");
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Bob");
            preparedStatement.setString(2, "bob@example.com");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
