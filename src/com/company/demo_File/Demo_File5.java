package com.company.demo_File;

import java.io.File;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:32
 *
 *      String[] list() 返回一个字符串数组，用于命名此抽象路径名表示的目录中的文件和目录。
 *      File[] listFiles() 返回一个抽象路径名数组，表示此抽象路径名表示的目录中的文件。
 *
 *      注意:
 *          list方法和listFile 方法遍历的是构造方法给出的目录
 *          构造方法不存在,空指针异常
 *          构造方法不是一个目录.空指针异常
 *
 */
public class Demo_File5 {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File file = new File("C:\\Users\\Gavin\\Desktop");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    private static void show01() {
        File f1 = new File("C:\\Users\\Gavin\\Desktop");
        String[] arr = f1.list();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
