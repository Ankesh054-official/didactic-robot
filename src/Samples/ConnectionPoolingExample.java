//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class ConnectionPoolingExample {
//    public static void main(String[] args) {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydatabase");
//        config.setUsername("username");
//        config.setPassword("password");
//        HikariDataSource dataSource = new HikariDataSource(config);
//
//        try (Connection connection = dataSource.getConnection()) {
//            System.out.println("Connection obtained from pool!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
