package jdbcpractice;

import java.io.FileInputStream;
import java.sql.*;

public class d_InsertImageJdbc {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            String query = "insert into images(photo) values(?)";

            PreparedStatement pstmnt = con.prepareStatement(query);

            //Read the file from system
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Sagar Gandhi\\Desktop\\jdbc\\src\\jdbcpractice\\photo.jpg");
            pstmnt.setBinaryStream(1, fileInputStream, fileInputStream.available());
            pstmnt.executeUpdate();

            System.out.println("Image inserted...");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
