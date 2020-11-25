package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/24 19:48
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/python", "root", "123456");
        //4.定义sql语句
        String sql = "select * from user where username = 'rr'";
        //5.获取执行sql 的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        boolean b = stmt.execute(sql);
        //7.处理结果
        System.out.println(b);

    }
}
