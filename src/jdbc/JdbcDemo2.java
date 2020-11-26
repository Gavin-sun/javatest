package jdbc;

import java.sql.*;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/24 19:48
 *
 *      在user表里添加一跳记录 insert 语句
 *
 */
public class JdbcDemo2 {
    public static void main(String[] args){
        Statement stmt =null;
        Connection conn=null;
        try{
            //1.导入驱动jar包
            //2.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/python", "root", "123456");
            //4.定义sql语句
            String sql = "select * from user";
            //5.获取执行sql 的对象 Statement
            stmt = conn.createStatement();
            //6.执行sql
            ResultSet rs = stmt.executeQuery(sql);
            //7.处理结果
            while (rs.next()){
                String name = rs.getString(1);
                String password = rs.getString(2);
                System.out.println(name+' '+password);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            //避免空指针异常
            if(stmt==null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn==null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
