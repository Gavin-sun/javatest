package com.company.demo_IO.demo_Bufferio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 16:35
 *
 *          BufferedOutputStream 字节缓冲输出流
 *
 *          继承自父类的共性成员方法
 *              void close() 关闭此输出流并释放与此流关联的所有系统资源。
 *              void flush() 刷新此输出流并强制写出任何缓冲的输出字节。
 *              static OutputStream nullOutputStream() 返回一个新的 OutputStream ，它丢弃所有字节。
 *              void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
 *              void write(byte[] b, int off, int len) 将从偏移量 off开始的指定字节数组中的 len字节写入此输出流。
 *              abstract void write(int b) 将指定的字节写入此输出流。
 *          构造方法:
 *              BufferedOutputStream(OutputStream out) 创建新的缓冲输出流以将数据写入指定的基础输出流。
 *              BufferedOutputStream(OutputStream out, int size) 创建新的缓冲输出流，以使用指定的缓冲区大小将数据写入指定的基础输出流。
 *          使用步骤:
 *              1.FileOutputStream 对象,构造方法中要绑定输出的目的地
 *              2.创建BufferedOutputStream对象,构造方法传递FileOutputStream
 *              3.使用BufferedOutputStream对象的方法wirte,吧数据写入到内部缓冲区
 *              4.使用BufferedOutputStream对象的flush 把数据刷新到文件
 *              5.释放资源
 *
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Gavin\\Desktop\\a.txt"));
        bos.write("你好啊".getBytes());
        bos.close();
    }
}
