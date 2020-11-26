package jdbc;

import util.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 18:52
 */
public class jdbcDemo04 {
    public static void main(String[] args) {
        String name = "111";
        String password = "122";
        if(login(name,password)){
            System.out.println("密码正确");
        }else {
            System.out.println("密码错误");
        };
    }

    private static boolean login(String name,String password) {
        Connection conn=null;
        PreparedStatement pstmt =null;
        ResultSet rs = null;
        try{
            String sql = "select * from user where username =? and password=?";
            conn = JDBCutils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            JDBCutils.close(rs,pstmt,conn );
        }
        return false;
    }
}
