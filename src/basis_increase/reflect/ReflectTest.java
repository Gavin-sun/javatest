package basis_increase.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 13:34
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象,执行任意方法

//        Person p = new Person();
//        p.eat();
        //1. 加载配置文件
        Properties pro = new Properties();
        //1.2.1 获取class目录下的配置文件
//        ClassLoader classLoader = ReflectTest.class.getClassLoader();//类加载器
//        InputStream is = classLoader.getResourceAsStream("pro.properties");
        File file =new File("src\\pro.properties");
        InputStream is = new FileInputStream(file);
        pro.load(is);

        //2.获取配置文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存,
        Class cls = Class.forName(className);
        //4.创建对象
        Object o = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行
        method.invoke(o);


    }
}
