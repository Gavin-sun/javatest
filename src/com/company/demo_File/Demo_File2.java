package com.company.demo_File;

import java.io.File;
import java.util.logging.FileHandler;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 20:53
 *
 *      File类获取功能的方法
 *          -public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串。
 *          -public String getPath() 将此抽象路径名转换为路径名字符串。
 *          -public String getName() 返回此抽象路径名表示的文件或目录的名称。
 *          -public long length() 返回此抽象路径名表示的文件的长度。  
 */
public class Demo_File2 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File file = new File("C:\\Users\\Gavin\\Desktop\\倒影.jpg");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length()/1000+"KB");

        File f2 = new File("a.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());
        System.out.println(f2.length());


    }
}
