package com.company.demo_File;

import java.io.File;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 21:56
 */
public class Demo_File6_DIgui {
    public static void main(String[] args) {
        File file = new File("G:\\LOL");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()) getAllFiles(f);
            else System.out.println(f);
        }
    }
}
