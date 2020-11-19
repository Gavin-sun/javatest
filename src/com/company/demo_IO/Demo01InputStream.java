package com.company.demo_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 14:01
 *
 *      字节输入流的使用步骤(重点):
 *          1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *          2.使用read 读取文件
 *          3.释放资源
 *
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Gavin\\Desktop\\b.txt");
        int len = fis.read();//返回int
        System.out.println(len);

        byte[] bytes = new byte[3];
        int len2 = fis.read(bytes);
        System.out.println(len2);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes,0,len2));
        fis.close();

    }
}
