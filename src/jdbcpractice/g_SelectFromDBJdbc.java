package jdbcpractice;

import java.sql.*;

public class g_SelectFromDBJdbc {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();

            String query = "select * from person";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);

                System.out.println("Id:" + id + ", Name:" + name + ", City:" + city);
            }

            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
