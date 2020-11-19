package com.company.demo_Net;

import java.io.*;
import java.net.Socket;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/19 10:11
 *
 *      实现步骤:
 *          1.创建一个本地fileInputStream对象,绑定文件
 *          2.创建socket对象 绑定ip和端口
 *          3.获取网络字节输出流
 *          4.使用本地的read 读取本地文件
 *          5.使用网络字节输出流 OutputStream的方法Write 把文件上传到服务器
 *          6.使用Socket中的方法getInputStream 获取网络字节输入流对象
 *          7.用read 读取服务器回写的数据
 *          8.释放资源(fileInputStream,socket)
 */
public class Demo_FileUp_Client {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("C:\\Users\\Gavin\\Desktop\\1.xls");
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream op = socket.getOutputStream();
        int len =0;
        byte bytes[]= new byte[1024];
        while((len = fi.read(bytes))!=-1){
            op.write(bytes,0,len);
        }
        socket.shutdownOutput();
        System.out.println("读取完成,发送完成,等待回复");
        InputStream is = socket.getInputStream();
        while((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        op.close();
        fi.close();
        socket.close();
    }
}
