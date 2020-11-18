package com.company.demo_File;

import java.io.File;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 20:22
 *
 *      java.io.File 类
 *      文件和目录路径名的抽象表现形式
 *      java把电脑中的文件和文件夹(目录)封装为了一个file 类,我们可以使用FIle 类对文件和文件夹进行操作
 *      我们可以:
 *          创建一个文件/文件夹
 *          删除文件/文件夹
 *          获取文件/文件夹
 *          判断文件/文件夹是否存在
 *          对文件夹进行遍历
 *          获取文件大小
 *
 *          重点:记住三个单词
 *              file:文件
 *              directory:文件夹/目录
 *              path:路径
 *              "C:/develop/a/a.txt"
 *              "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
 *
 *              windows 下反斜杠,需要用\\ 第一个\ 是转义字符
 *
 */
public class Demo_FIle1 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符 windows ;  Linux :
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符  windows:反斜杠 \  Linux /

        show02();
        //FIle类的构造方法

    }

    private static void show02() {

    }

    private static void show01() {
        File f1 =new File("C:\\Users\\Gavin\\Desktop\\a.txt");
        System.out.println(f1);
    }

}
