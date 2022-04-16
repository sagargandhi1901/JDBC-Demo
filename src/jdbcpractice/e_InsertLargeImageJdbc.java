package jdbcpractice;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class e_InsertLargeImageJdbc {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            String query = "insert into images(photo) values(?)";

            PreparedStatement pstmnt = con.prepareStatement(query);

            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showOpenDialog(null);
            File file = jFileChooser.getSelectedFile();

            //Read the file from system
            FileInputStream fileInputStream = new FileInputStream(file);
            pstmnt.setBinaryStream(1, fileInputStream, fileInputStream.available());
            pstmnt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Success");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
