package jdbcpractice;

import java.sql.*;

public class ConnectionProvider {

    private static Connection connection;

    public static Connection getConnection() {

        try {
            if (connection == null) {

                // Load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create a connection
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
