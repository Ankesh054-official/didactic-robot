//package Samples;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class TransactionExample {
//    public static void main(String[] args) {
//        Connection connection;
//
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
//            connection.setAutoCommit(false);
//            String query1 = "UPDATE accounts SET balance = balance - 100 WHERE id = 1";
//            String query2 = "UPDATE accounts SET balance = balance + 100 WHERE id = 2";
//            PreparedStatement stmt1 = connection.prepareStatement(query1);
//            PreparedStatement stmt2 = connection.prepareStatement(query2);
//            stmt1.executeUpdate();
//            stmt2.executeUpdate();
//            connection.commit();
//            stmt1.close();
//            stmt2.close();
//            connection.close();
//        } catch (SQLException e) {
//            try {
//                connection.rollback();
//            } catch (SQLException rollbackException) {
//                rollbackException.printStackTrace();
//            }
//            e.printStackTrace();
//        }
//    }
//}
