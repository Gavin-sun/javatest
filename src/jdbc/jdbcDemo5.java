package jdbc;

import util.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 19:07
 */
public class jdbcDemo5 {

        public static void main(String[] args) {
            String name = "111";
            String password = "122";
            if(login(name,password)){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            };
        }

        private static boolean login(String name,String password){
            Connection conn=null;
            PreparedStatement pstmt =null;
            ResultSet rs = null;
            try{
                conn.setAutoCommit(false);
                String sql = "select * from user where username =? and password=?";
                conn = JDBCutils.getConnection();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,name);
                pstmt.setString(2,password);
                rs = pstmt.executeQuery();
                conn.commit();
                return rs.next();
            }catch (Exception e){
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                System.out.println(e);
            }finally {
                JDBCutils.close(rs,pstmt,conn );
            }
            return false;
        }
    }


