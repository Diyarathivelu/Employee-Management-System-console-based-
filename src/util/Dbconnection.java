package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/employeemanagementsystem","root","");

            System.out.println("Connected to database");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}