package com.company.demo_File;

import java.io.File;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:17
 *      boolean createNewFile() 当且仅当具有此名称的文件尚不存在时，以原子方式创建由此抽象路径名命名的新空文件。
 *      boolean delete() 删除此抽象路径名表示的文件或目录。
 *      boolean mkdir() 创建此抽象路径名指定的目录。
 *      boolean mkdirs() 创建此抽象路径名指定的目录，包括任何必需但不存在的父目录。
 *
 */
public class Demo_FIle4 {
    public static void main(String[] args) {
        show03();
    }
    //boolean delete() 删除此抽象路径名表示的文件或目录。
    private static void show03() {
        File f2 = new File("C:\\Users\\Gavin\\Desktop\\a.txt");
        boolean b1 = f2.delete();
        System.out.println(b1);
    }

    //boolean mkdir() 创建此抽象路径名指定的目录。
    //只能创建单级文件夹
    //boolean mkdirs() 创建此抽象路径名指定的目录，包括任何必需但不存在的父目录。
    //能创建单/多级文件夹
    //只在不存在的时候创建 ,只能创建文件夹
    private static void show02() {
        File f2 = new File("C:\\Users\\Gavin\\Desktop\\a");
        boolean b1 = f2.mkdir();
        System.out.println(b1);

        File f3 = new File("C:\\Users\\Gavin\\Desktop\\a\\b\\c");
        boolean b2 = f3.mkdirs();
        System.out.println(b1);
    }

    //boolean createNewFile() 只能创建文件,不能创建文件夹
    // 文件已经存在就不会再创建了
    // 路径不存在,抛出异常
    private static void show01() {
        File f1 = new File("C:\\Users\\Gavin\\Desktop\\a.txt");
        boolean b1 = false;
        try {
            b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b1);




    }
}
