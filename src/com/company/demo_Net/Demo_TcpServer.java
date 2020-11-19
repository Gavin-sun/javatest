package com.company.demo_Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/19 9:46
 *
 *      接受客户端的请求,读取客户端发送的数据
 *          java.net.ServerSocket 该类实现服务器套接字。 服务器套接字等待通过网络进入的请求。 它根据该请求执行某些操作，然后可能将结果返回给请求者。
 *
 *      构造方法:
 *          ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
 *      服务器端必须明确一件事,必须知道是哪个客户端请求的服务器,使用accept方法接受到发送的客户端对象
 *
 *      成员方法:
 *          Socket accept() 侦听对此套接字的连接并接受它。
 *
 *      服务器的实现步骤:
 *          1.创建服务器ServerSocket对象和指定端口号
 *          2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket
 *          3.使用Socket对象的方法getInputStream() 获取网络字节输入流InputStream
 *          4.使用网络字节输入流的InputStream对象中的方法read 读取客户端发送的数据
 *          5.使用Socket对象中的方法getOutputStream() 获取网络字节输出流OutputStream
 *          6.使用网络字节输出流OutputStream 对象中的方法write,给客户端回写数据
 *          7.释放资源(Socket,ServerSocket)
 */
public class Demo_TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream ipt = socket.getInputStream();
        byte bytes[] = new byte[1024];
        int len = ipt.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());

        socket.close();
        ss.close();
    }
}
