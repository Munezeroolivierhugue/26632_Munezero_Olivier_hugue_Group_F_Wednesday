package OopAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * This program simulates a SQLException.
 * It attempts to connect to a non-existent database.
 */
public class SQLExceptionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Attempt to connect to a non-existent database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentDB", "root", "password");
            System.out.println("Database connection successful.");
        } catch (SQLException e) {
            // Handle the SQL connection failure
            System.out.println("Error: Unable to connect to database.");
        } finally {
            // Cleanup: Close the connection incase it was extablished it was established
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Error while closing database connection.");
                }
            }
        }
    }
}

