package com.company.demo_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 11:59
 *
 *      void close() 关闭此输出流并释放与此流关联的所有系统资源。
 *      void flush() 刷新此输出流并强制写出任何缓冲的输出字节。
 *      static OutputStream nullOutputStream() 返回一个新的 OutputStream ，它丢弃所有字节。
 *      void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
 *      void write(byte[] b, int off, int len) 将从偏移量 off开始的指定字节数组中的 len字节写入此输出流。
 *      abstract void write(int b) 将指定的字节写入此输出流。
 *
 *
 *      java.io.FileOutStream extends OutputStream
 *      FileOutputStream :文件字节输出流
 *      作用:把内存中的文件数据写入到硬盘的文件中
 *
 *      构造方法:
 *          FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。
 *          FileOutputStream(String name) 创建文件输出流以写入具有指定名称的文件。
 *          参数:写入数据的目的
 *              String name 目的地是一个文件路径
 *              File file 目的地是一个文件
 *
 *          构造方法的作用:
 *              1.构造一个FileOutputStream 对象
 *              2.会根据构造方法中传递的文件/文件路径,创建一个空的文件
 *              3.会把FileOutputStream对象指向创建好的文件
 *
 *              写入数据的原理(内存->硬盘)
 *                  java对象->jvm->os->os调用写入的方法->把数据写到文件
 *
 *
 *      字节输出流的使用步骤(重点):
 *          1.创建一个FileOutputStream对象,构造方法中写入数据的目的地
 *          2.调用对象中的方法write,写入到文件中
 *          3.释放资源(清空内存)

 */
public class Demo01OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Gavin\\Desktop\\a.txt");
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
