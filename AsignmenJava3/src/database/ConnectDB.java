/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vinh
 */
public class ConnectDB {
    public static Connection getConn(){
        try {
            String connectionUrl
                = "jdbc:sqlserver://DESKTOP-6AAMN1T\\VINH:1433;databaseName=HeThongQuanLy;user=sa;password=123;encrypt=false";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
           ex.printStackTrace();
        }
        return null;
    }
}
