
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        // Establishing a connection to the database
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");
            connection.close(); // Closing the connection
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
