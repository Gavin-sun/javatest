package com.company.demoProperties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 15:37
 *
 *      java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 *
 *          Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。
 *          Properties集合是一个唯一和IO流相结合的集合
 *              可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
 *              可以使用Properties集合中的方法load ,吧硬盘中保存的文件(键值对) 读取到集合中使用
 *
 *          属性列表中的每个键及其对应的值都是一个字符串。
 *              Properties集合是一个双列集合,k,v默认都是字符串
 */
public class Demoprop {
    public static void main(String[] args) throws IOException {

        show03();
    }
    /*
        可以使用Properties集合中的方法load ,吧硬盘中保存的文件(键值对) 读取到集合中使用

     */

    private static void show03() throws IOException {
        Properties pro2 = new Properties();
        FileReader fr = new FileReader("C:\\Users\\Gavin\\Desktop\\a.txt");
        pro2.load(fr);
        Set<String> set = pro2.stringPropertyNames();

        for (String key : set) {
            String value = pro2.getProperty(key);
            System.out.println(key+"="+value);
        }

    }
    /*
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        void store(OutputStream out, String comments) 将此 Properties表中的此属性列表（键和元素对）以适合使用 load(InputStream)方法加载到 Properties表的格式写入输出流。
        void store(Writer writer, String comments) 将此 Properties表中的此属性列表（键和元素对）以适合使用 load(Reader)方法的格式写入输出字符流。
        参数:
            OutputStream 字节输出流,不能写中文
            Writer 字符输出流 可以写中文
            String comments 注释,用来解释说明保存的文件是干啥用的
                            不能使用中文,一般使用"" 空字符串
        使用步骤:
            1.创建prop集合对象 添加数据
            2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
            3.使用Properties 集合中的方法store 把集合中的临时数据,持久化写入到硬盘中
            4.释放资源
     */

    private static void show02() throws IOException {
        Properties prop =new Properties();
        prop.setProperty("aaa","111");
        prop.setProperty("bbb","222");
        prop.setProperty("ccc","333");

        FileWriter fw = new FileWriter("C:\\Users\\Gavin\\Desktop\\a.txt",true);
        prop.store(fw,"save data");
        fw.close();
    }
    /*
        Properties集合有一些操作字符串的特有方法
            Object setProperties(String key,String value) 调用hashtable 的方法put
            String getProperties(String key)  用指定的键来获取对应元素 相当于map里面的get(key)方法
            Set<String> stringPropertyNames() 返回此属性列表中的键集,相当于map里面的keySet()方法

     */

    private static void show01() {
        Properties prop =new Properties();
        prop.setProperty("aaa","111");
        prop.setProperty("bbb","222");
        prop.setProperty("ccc","333");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
