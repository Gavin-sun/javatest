package util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 18:16
 *
 *      不想传递参数,麻烦,还要保证通用性
 *      解决,配置文件
 */
public class JDBCutils {
    private static String url;
    private static String name;
    private static String password;
    private static String dirver;

    static {
        //1.创建Properties集合类

        try {
            Properties pro = new Properties();
            //还可以使用类加载器
//            ClassLoader cl = JDBCutils.class.getClassLoader();
//            URL resource = cl.getResource("jdbc.properties");
//            String path = resource.getPath();
//            pro.load(new FileReader(path));
            pro.load(new FileReader("src/jdbc.properties"));
            url=pro.getProperty("url");
            name=pro.getProperty("user");
            password=pro.getProperty("password");
            dirver=pro.getProperty("dirver");
            Class.forName(dirver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url,name,password);
    }

    public static void close(Statement stmt, Connection conn){
        try{
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
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void close(ResultSet rs,Statement stmt, Connection conn){
        try{
            if(rs==null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
