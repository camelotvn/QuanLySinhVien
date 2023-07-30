package database;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Grade;

/**
 *
 * @author Vinh
 */
public class GradeDao {

    public static ArrayList<Grade> ShowData() {
        ArrayList<Grade> arrlist = new ArrayList<>();
        try {  
            java.sql.Connection cons = ConnectDB.getConn();
            String sql = "SELECT g.MASV, s.HoTen, g.TiengAnh, g.TinHoc, g.GDTC FROM grade g JOIN students s ON g.MASV = s.MASV";
            PreparedStatement stm = cons.prepareStatement(sql);
            ResultSet res = stm.executeQuery();
            while(res.next()){
                String Masv = res.getString(1);
                String Hoten = res.getString(2);
                int TiengAnh = res.getInt(3);
                int TinHoc = res.getInt(4);
                int gdtc = res.getInt(5);
                Grade grd = new Grade(Masv,Hoten, TiengAnh, TinHoc, gdtc);
                arrlist.add(grd);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return arrlist;
    }
    
    public static boolean update(String MaSV, int TiengAnh,int TinHoc,int GDTC){
        try {
            java.sql.Connection cons = ConnectDB.getConn();
            String sql = "Update Grade set TiengAnh =?,TinHoc =?,GDTC =? where MASV = ?";
            PreparedStatement stm = cons.prepareStatement(sql);
            stm.setInt(1, TiengAnh);
            stm.setInt(2, TinHoc);
            stm.setInt(3, GDTC);
            stm.setString(4, MaSV);
            stm.executeUpdate();
            stm.close();
            cons.close();
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
            
       }
}
