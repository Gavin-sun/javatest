package com.company.demo_File;

import java.io.File;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:56
 *
 *  只要java 为后缀的文件
 */
public class Demo_File6_findfile {
    public static void main(String[] args) {
        File file = new File("F:\\javatest\\out");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()) getAllFiles(f);

            else {
                //只要java 为后缀的文件
                String name = f.getName();
                name = name.toLowerCase(); // 转换为小写,如果是大写的.JAVA 无法获取到
                boolean b1 = name.endsWith(".html");
                if(b1) System.out.println(f);
            }
        }
    }
}
