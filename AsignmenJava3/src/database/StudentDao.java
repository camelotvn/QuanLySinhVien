/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import models.Students;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Vinh
 */
public class StudentDao {
    

public static  ArrayList<Students> ViewDatabase() {
    ArrayList<Students> Liststd = new ArrayList<>();
    try {     
        Connection cons = ConnectDB.getConn();
        String sql = "SELECT * FROM students";
        PreparedStatement selectStatement = cons.prepareStatement(sql);
        ResultSet rs = selectStatement.executeQuery();

        while (rs.next()) {
            String masv = rs.getString("MASV");
            String hoTen = rs.getString("HoTen");
            String email = rs.getString("Email");
            String soDT = rs.getString("SoDT");
            int gioiTinh = rs.getInt("GioiTinh");
            String diaChi = rs.getString("DiaChi");
            String hinh = rs.getString("Hinh");

            Students std = new Students(masv, hoTen, email, soDT, gioiTinh, diaChi, hinh);
            Liststd.add(std);
        }
        // dong ket noi
        rs.close();
        selectStatement.close();
        cons.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Liststd;
}
        public static boolean SaveInfo(String Manv,String Hoten,String Email,String sdt,String gioitinh,String diachi,String hinh){
            try {
                boolean gioiTinhValue; 
                if(gioitinh.equals("Nam")){
                    gioiTinhValue = true;
                }
                else {
                    gioiTinhValue = false;
                }
                Connection cons = ConnectDB.getConn();
                String sql = "insert into students values(?,?,?,?,?,?,?)";
                PreparedStatement insertStatement = cons.prepareStatement(sql);
                insertStatement.setString(1, Manv);
                insertStatement.setString(2, Hoten);
                insertStatement.setString(3, Email);
                insertStatement.setString(4, sdt);
                insertStatement.setBoolean(5, gioiTinhValue);
                insertStatement.setString(6, diachi);
                insertStatement.setString(7, hinh);
                insertStatement.executeUpdate();
                insertStatement.close();
                cons.close();
                return true;
            } catch (Exception e) {
                return false;
                
            }
            
        }
        public static void Update(String Masv,String Hoten,String Email,String sdt,String gioitinh,String diachi ){
              try {
                  Connection cons = ConnectDB.getConn();
                int gt;
                if(gioitinh.equals("Nam")){
                    gt =1;
                }
                else {
                    gt = 0;
                }
                 String sql = "update students set Masv = ?,HoTen = ?,Email = ?,SoDT = ?,GioiTinh = ?,DiaChi = ? where MaSV = ?";
                 PreparedStatement insertStatement = cons.prepareStatement(sql);
                 insertStatement.setString(1, Masv);
                 insertStatement.setString(2, Hoten);
                 insertStatement.setString(3, Email);
                 insertStatement.setString(4, sdt);
                 insertStatement.setInt(5, gt);
                 insertStatement.setString(6, diachi);
                 insertStatement.setString(7, Masv);
                 insertStatement.executeUpdate();
                 insertStatement.close();
                 cons.close();
            } catch (Exception e) {
                e.printStackTrace();              
            }              
        }
        public static boolean updateIMG(String msv, String hinh){
            try {
                 Connection cons = ConnectDB.getConn();
                 String sql = "update students set Hinh = ? where MASV = ?";
                 PreparedStatement insertStatement = cons.prepareStatement(sql);
                 insertStatement.setString(1, hinh);
                 insertStatement.setString(2, msv);
                 insertStatement.executeUpdate();
                 cons.close();
                 insertStatement.close();
                 return true;
                 
            } catch (Exception e) {
                return false;
            }
        }
        public static boolean Remove(String MaSV){
              try {
                 Connection cons = ConnectDB.getConn();
                String sql = "Delete from students where MaSV = ?";
                PreparedStatement insertStatement = cons.prepareStatement(sql); 
                insertStatement.setString(1, MaSV);
                int aff = insertStatement.executeUpdate();
                  if (aff >0) {
                      return true;
                  }
                  else {
                      return false;
                  }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
                
        }
}
