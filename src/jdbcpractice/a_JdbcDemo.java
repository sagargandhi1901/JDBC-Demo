package jdbcpractice;

import java.sql.*;

public class a_JdbcDemo {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection created...");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
