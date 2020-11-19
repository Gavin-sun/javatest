package com.company.demo_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 14:21
 *
 *      复制的数据源:
 *      复制的目的地;
 *      文件复制的步骤:
 *          1.一个字节输入流对象,构造方法绑定读取的数据源
 *          2.创建一个字节输出流,构造方法绑定要写入的目的地
 *          3.read读取文件
 *          4.write写入文件
 *          5.释放资源
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Gavin\\Desktop\\b.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Gavin\\Desktop\\a.txt");
//        int len;
//        while((len = fis.read())!=-1){
//            fos.write(len);
//        }

        byte  bytes[] = new byte[1024];
        int len =0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
