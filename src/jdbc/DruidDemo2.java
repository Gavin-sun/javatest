package jdbc;

import util.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 19:50
 *              使用工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps =null;
        ResultSet rs=null;
        try {
            conn = DruidUtils.getConnection();
            String sql = "select * from user where username=? and password =?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"123");
            ps.setString(2,"123");
            rs = ps.executeQuery();
            System.out.println(rs.next());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DruidUtils.close(rs,ps,conn);
        }

    }
}
