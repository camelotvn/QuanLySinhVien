/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.User;

/**
 *
 * @author Vinh
 */
public class AdminDao {
      public static boolean CheckLogin(String username,String password){
        try {
            Connection cons = ConnectDB.getConn();
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
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
        public static ArrayList<User> ViewAll(){
        ArrayList<User> user = new ArrayList<>();

        try {
            Connection cons = ConnectDB.getConn();
            String sql = "select * from users";
            PreparedStatement stm = cons.prepareStatement(sql);
            ResultSet rs= stm.executeQuery();
            while(rs.next()){
                String username = rs.getString(1);
                String password = rs.getString(2);
                String role = rs.getString(3);
                String email = rs.getString(4);
                boolean isActive = rs.getBoolean(5);
                User us = new User(username, password, role, email,isActive);
                user.add(us);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
     public static boolean Save(String user,String pass,String role,String email,boolean isActive) { 
        try {
        Connection cons = ConnectDB.getConn();
            String sql = "insert into users values(?,?,?,?,?)";
            PreparedStatement insertStatement = cons.prepareStatement(sql);
            insertStatement.setString(1,user);
            insertStatement.setString(2,pass);
            insertStatement.setString(3,role);
            insertStatement.setString(4,email);
            insertStatement.setBoolean(5,isActive);
            insertStatement.executeUpdate();
            insertStatement.close();
            cons.close();
            return true;
        } catch (Exception e) {
            return false;
        }  
}
     public static boolean Update(String us,String ps,String email,String role,boolean isActive){
         try {
             Connection cons = ConnectDB.getConn();
         String sql = "Update users set Password =?,role =?,Email = ?,isActive = ? where Username =?";
         PreparedStatement insertStatement = cons.prepareStatement(sql);
            insertStatement.setString(1,ps);
            insertStatement.setString(2,role);
            insertStatement.setString(3,email);
            insertStatement.setBoolean(4,isActive);
            insertStatement.setString(5,us);
            insertStatement.executeUpdate();
            insertStatement.close();
            cons.close();
            return true;
         } catch (Exception e) {
             return false;
         }
     }
}
