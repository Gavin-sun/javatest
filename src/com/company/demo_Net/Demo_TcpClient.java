package com.company.demo_Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/19 9:32
 *
 *      TCP通信的客户端,向服务器发送连接请求,给服务器发送数据,读取服务器回写的数据
 *      表示客户端的类:
 *          java.net.Socket 该类实现客户端套接字（也称为“套接字”）。 套接字是两台机器之间通信的端点
 *          套接字:包含了IP地址和端口号的网络单位
 *      构造方法:
 *          Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
 *
 *      成员方法:
 *          OutputStream getOutputStream() 返回此套接字的输出流。
 *          InputStream getInputStream() 返回此套接字的输入流。
 *          void close() 关闭此套接字。
 *
 *      实现步骤:
 *          1.创建一个客户端Socket,构造方法和绑定服务器的IP地址和端口号
 *          2.使用Socket中的方法getOutputStream()获取网络字节输出流的OutputStream对象
 *          3.使用网络字节输出流中的OutputStream对象 中的方法write,给服务器发送数据
 *          4.使用Socket中的方法getInputStream()获取网络字节输入流的InputStream对象
 *          5.使用网络字节输入流中的InputStream对象 中的方法 read,读取服务器回写的数据
 *          6.释放资源(Socket)
 *
 *      注意事项:
 *          1.客户端和服务器端进行交互,必须使用Socket中提供的网络流,不能使用自己创建的流对象
 *          2.当我们创建的客户端对象Socket的时候,会请求三次握手
 *              启动了->交互
 *              没启动->异常
 */
public class Demo_TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());

        InputStream is = socket.getInputStream();
        byte bytes[] = new byte[1024];
        int len =is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();
    }
}
