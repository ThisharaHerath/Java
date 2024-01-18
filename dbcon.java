/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class dbcon {
    public static Connection c;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3307/myshop";
            String un = "root";
            String pw = "123456";
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/myshop?useSSL=false","root","123456");
                      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void IUD(String Query) throws Exception{ // I - insert / U - update / D - delete
        Statement s = c.createStatement();
        s.executeUpdate(Query);
    }
    public static ResultSet SEARCH(String query) throws Exception{
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        return rs;
    }

   
}
