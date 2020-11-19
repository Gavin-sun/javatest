package com.company.demo_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 11:59
 *
 *      一次性写入多个字节的方法:
 *          -public void write(byte[] b): 将b.length字节从指定的字节数组写入到此输出流
 *          -public void write(byte[] b,int off,int len): 从指定的字节数组写入len字节,从偏移量off开始输出要此输出流
 *
 *
 */
public class Demo02OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Gavin\\Desktop\\b.txt"));

            fos.write(97);
            fos.write(98);
            fos.write(99);
            byte[] bt={49,100,102};
            fos.write(bt);
            byte[] bt2 = "你好".getBytes();
            System.out.println(Arrays.toString(bt2));
            fos.write(bt2);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
