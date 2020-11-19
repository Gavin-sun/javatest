package com.company.demo_IO.Reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 15:01
 *
 *      字符输出流的使用步骤:
 *          1.创建FileWriter对象,构造方法中绑定要写入的数据目的地
 *          2.使用方法write 把数据写入到内存缓冲区中
 *          3.使用FileWriter中的方法flush,将内存缓冲区中的数据,刷新到文件中
 *          4.释放资源
 *
 *
 *          续写wirte(xxx,true)
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Gavin\\Desktop\\a.txt");
        fw.write(97);
        char[] cs = {'a','b','c','d'};
        fw.write(cs);

        fw.write(cs,1,3);

        fw.write("天天向上");

        fw.write("天天向上",2,2);
        fw.flush();
        fw.close();//和flush都可以把数据从缓冲区 刷进文件中
    }
}
