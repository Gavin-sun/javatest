package com.company.demo_Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/19 10:33
 */
public class Demo_FileUP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(){
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        String filename = System.currentTimeMillis()+".xls";
                        File file = new File("C:\\Users\\Gavin\\Desktop\\upload");
                        if(!file.exists()){
                            file.mkdir();
                            System.out.println("创建文件夹");
                        }
                        FileOutputStream fo = new FileOutputStream(file+"\\"+filename);
                        int len =0;
                        byte bytes[] = new byte[1024];
                        while((len = is.read(bytes))!=-1){
                            fo.write(bytes,0,len);
                        }
                        System.out.println("获取完成");
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                        fo.close();
                        os.close();

                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }.start();

        }
        //serverSocket.close();
    }
}
