package jdbcpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class f_UpdateDBJdbc {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();

            String query = "update person set name = ? , city = ? where id = ? ";

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new name : ");
            String name = sc.next();
            System.out.println("Enter new City : ");
            String city = sc.next();
            System.out.println("Enter persom id : ");
            int id = sc.nextInt();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, city);
            statement.setInt(3, id);

            statement.executeUpdate();

            System.out.println("Data updated...");

            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
