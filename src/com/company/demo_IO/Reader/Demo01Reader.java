package com.company.demo_IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 14:42
 *
 *      java.io.Reader:字符输入流,是字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类
 *      共性的成员方法:
 *          int read() 读取单个字符并返回
 *          int read(char[] cbuf) 一次读取多个字符,将字符读入数组;
 *          close()
 *
 *      java.io.FileReader extends InputStreamReader extends Reader
 *      FileReader:文件字符输入流
 *      作用:吧硬盘文件中的数据以字符的方式读取到内存中
 *
 *      构造方法:
 *          FileReader(String fileName)
 *          FileReader(File file)
 *          参数,数据源
 *
 *      字符输入流的使用步骤:
 *          1.创建FileReader对象,构造方法中绑定要读取的数据源
 *          2.使用read读取文件
 *          3.释放资源
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Gavin\\Desktop\\b.txt");
//        int len =0;
//        while((len=fr.read())!=-1){
//            System.out.print((char)len);
//        }
        char[] cs = new char[1024];
        int len = 0;
        while((len = fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }

}
