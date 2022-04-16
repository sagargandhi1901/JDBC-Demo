package jdbcpractice;

import java.sql.*;

public class b_CreateTableJdbc {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            // Create a query
            String query = "create table Person(id int(20) primary key auto_increment, name varchar(200) not null, city varchar(400))";

            // Create a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Table Person created...");

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
