package jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class c_InsertIntoTableJdbc {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            // Create a query
            String query = "insert into person(name, city) values (?, ?)";

            //Get the prepared statement object
            PreparedStatement pstmnt = con.prepareStatement(query);

            //Taking data from user
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter name : ");
            String name = sc.next();
            System.out.println("Enter city : ");
            String city = sc.next();

            //Setting the values in the table
            pstmnt.setString(1, name);
            pstmnt.setString(2, city);

            pstmnt.executeUpdate();

            System.out.println("Data inserted...");

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
