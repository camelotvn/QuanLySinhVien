/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import models.User;
public class UserDao {

    public static boolean Reg(String user,String pass,String role,String email) { 
        try {
        Connection cons = ConnectDB.getConn();
            String sql = "insert into users values(?,?,?,?,?)";
            PreparedStatement insertStatement = cons.prepareStatement(sql);
            insertStatement.setString(1,user);
            insertStatement.setString(2,pass);
            insertStatement.setString(3,role);
            insertStatement.setString(4,email);
            insertStatement.setInt(5,1);
            insertStatement.executeUpdate();
            insertStatement.close();
            cons.close();
            return true;
            
        } catch (SQLException e) {
            return false;
        }
        
}
    public static boolean CheckLogin(String username,String password){
        try {
            Connection cons = ConnectDB.getConn();
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? AND isActive = 1";
             PreparedStatement  stm = cons.prepareStatement (sql);
             stm.setString(1, username);
             stm.setString(2, password);
            ResultSet res = stm.executeQuery();
           boolean result = res.next();
           res.close();
        stm.close();
        cons.close();
        return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean ChagePassword(String username,String oldps,String newps){
        try {
              Connection cons = ConnectDB.getConn();
              String sql = "Update users set password = '"+newps+"' where password = '"+oldps+"' and username ='"+ username + "'";
              PreparedStatement stm = cons.prepareStatement(sql);
               int rowsAffected = stm.executeUpdate();
               if(rowsAffected >0){
                   return true;
               }
               else {
                   return false;
               }
              
        } catch (Exception e) {
            return false;
        }
    }
    
    public static String checkrole(String user){
        try {
            Connection cons = ConnectDB.getConn();
        String sql = "select role from users where username = '"+user+"'";
        PreparedStatement stm = cons.prepareStatement(sql);
        ResultSet res = stm.executeQuery();
          if (res.next()) {
            String role = res.getString(1);
            return role;
        } else {
            return null;
        }
        } catch (Exception e) {
             return null;
        }
         
    } 
    public static  boolean checkpassword(String email){
            try {
                 Connection cons = ConnectDB.getConn();
                 String sql = "select * from users where Email ='" + email +"'";
                 PreparedStatement stm = cons.prepareStatement(sql);
                  ResultSet res = stm.executeQuery();
                  if (res.next()){
                      return true;
                  }
                  else {
                      return false;
                    }
                 
            } catch (Exception e) {
                return false;
            }
    }
    public static String getPassword(String email){
            try {
            Connection cons = ConnectDB.getConn();
        String sql = "select password from users where Email = '"+email+"'";
        PreparedStatement stm = cons.prepareStatement(sql);
        ResultSet res = stm.executeQuery();
          if (res.next()) {
            String pass = res.getString(1);
            return pass;
        } else {
            return null;
        }
        } catch (Exception e) {
             return null;
        }
         
    }
    public static String getdate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(currentDate);
    }
    
}
