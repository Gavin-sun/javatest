package com.company.demo_File;

import java.io.File;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:56
 *
 *      File[] listFiles(FileFilter filter) 返回一个抽象路径名数组，表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *      过滤器来实现:用于过滤文件(FIle对象)
 *      抽象方法:用于过滤文件的方法
 *          boolean accept (File pathname) 测试指定抽象路径名是否应该包含在某个路径中
 *          参数:
 *              File pathname :使用ListFiles 方法遍历目录,得到的每一个文件对象
 *
 *      File[] listFiles(FilenameFilter filter) 返回一个抽象路径名数组，表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *      java.io.FilenameFilter 接口:实现此接口的类实例可用于过滤器文件名
 *          作用:用于过滤文件名称
 *          抽象方法:用于过滤文件名称的方法
 *              boolean accept (File dir,String name) 测试指定抽象路径名是否应该包含在某个路径中
 *              参数:
 *                  File dir:构造方法中传递的被遍历的目录
 *                  String name: 使用ListFiles方法遍历目录,获取每一个文件/文件夹的名称
 *
 *     注意:
 *          两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class Demo_File6_filter {
    public static void main(String[] args) {
        File file = new File("F:\\javatest\\out");
        getAllFiles(file);
    }



    public static void getAllFiles(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器
        for (File f : files) {
            if(f.isDirectory()){
                getAllFiles(f);
            } else {
                //只要java 为后缀的文件
//                String name = f.getName();
//                name = name.toLowerCase(); // 转换为小写,如果是大写的.JAVA 无法获取到
//                boolean b1 = name.endsWith(".html");
//                if(b1)
                System.out.println(f);
            }
        }
    }
}
