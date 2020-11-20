package com.company.demo_Net;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 10:25
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("1.txt");
        fo.write("123".getBytes());
        fo.close();
    }
}
