package jdbc.jdbctemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.DruidUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/25 20:01
 *      JdbcTemplate入门
 */
public class JdbcTemplateDemo {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
        //3.调用方法
        String sql = "update user set password ='111' where username=?";
        int count = template.update(sql, "111");
        System.out.println(count);
        //queryForMap 期望结果为一条
        String sql2 = "select * from user where username=?";
        Map<String, Object> map = template.queryForMap(sql2, "111");
        System.out.println(map);

        String sql3 = "select * from user";
        List<Map<String, Object>> maps = template.queryForList(sql3);
        for (Map<String, Object> m : maps) {
            System.out.println(m);
        }


        //返回对象
        //List<Object> list = template.query(sql, new BeanPropertyRowMapper<Object>(Object.class));
        String sql5 = "select count(cupfree) from hostinfo";
        Long aLong = template.queryForObject(sql5, Long.class);
        System.out.println(aLong);
    }
}
