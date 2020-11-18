package com.company.demo_File;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:03
 *
 *      boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
 *      boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
 *      boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
 */
public class Demo_File3 {
    public static void main(String[] args) {
        show02();
    }
    // *      boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
    // *      boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
    private static void show02() {
        File f2 = new File("C:\\Users\\Gavin\\Desktop\\倒影.jpg");
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
    }

    // boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
    private static void show01() {
        File f1 = new File("C:\\Users\\Gavin\\Desktop\\倒影.jpg");
        System.out.println(f1.exists());

        File f2= new File("C:\\Users\\Gavin\\Deskto");
        System.out.println(f2.exists());
    }
}
