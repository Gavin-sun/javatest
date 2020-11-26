package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 19:42
 */
public class DruidUtils {
    private static DataSource ds;
    static {
        //静态代码块获取对象
        try {
            Properties pro = new Properties();
            pro.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  static Connection getConnection() throws SQLException {
        return  ds.getConnection();
    }

    public static void close(Statement stmt,Connection conn){
//        if(stmt!=null){
//            try {
//                stmt.close();
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
//        if(conn!=null){
//            try {
//                conn.close();
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
        close(null,stmt,conn);
    }

    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        if(conn!=null){
            try {
                conn.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
