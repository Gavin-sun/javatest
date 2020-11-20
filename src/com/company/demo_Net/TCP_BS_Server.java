package com.company.demo_Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 9:57
 */
public class TCP_BS_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        // 把is 网络字节输入流对象,转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 读取客户端请求的第一行 读取出来  GET /demo_Net/web/index.html HTTP/1.1
        String line = br.readLine();
        System.out.println(line);
        //用String 的split 分割字符串
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);
        System.out.println(htmlpath);
        //创建一个本地字符输入流,构造方法中绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);

        //获取socket 的网络字符输出流的对象
        OutputStream os = socket.getOutputStream();

        //固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());
        byte bytes[] = new byte[1024];
        int len2 = 0;
        while ((len2 = fis.read(bytes))!=-1){
            os.write(bytes,0,len2);
        }

        fis.close();
        socket.close();
        server.close();
    }
}
