
import java.sql.*;

public class CRUDOperations {

    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        // Establishing a connection to the database
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create operation
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, "John Doe");
                preparedStatement.setString(2, "john.doe@example.com");
                preparedStatement.executeUpdate(); // Executing the insert statement
            }

            // Read operation
            String selectSQL = "SELECT * FROM users";
            try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(selectSQL)) {
                while (resultSet.next()) {
                    System.out.println("User: " + resultSet.getString("name") + ", Email: " + resultSet.getString("email"));
                }
            }

            // Update operation
            String updateSQL = "UPDATE users SET email = ? WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setString(1, "new.email@example.com");
                preparedStatement.setString(2, "John Doe");
                preparedStatement.executeUpdate(); // Executing the update statement
            }

            // Delete operation
            String deleteSQL = "DELETE FROM users WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                preparedStatement.setString(1, "John Doe");
                preparedStatement.executeUpdate(); // Executing the delete statement
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
