package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestConnection {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/employeemanagementsystem","root","");
            
            PreparedStatement ps = con.prepareStatement(
                    "insert into employeetable values(?,?,?,?,?)");

                    ps.setInt(1,101);
                    ps.setString(2,"Arun");
                    ps.setString(3,"IT");
                    ps.setString(4,"IT");
                    ps.setInt(5,45000);

                    ps.executeUpdate();

                    System.out.println("Employee inserted successfully");
            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}