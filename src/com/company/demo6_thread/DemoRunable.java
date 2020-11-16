package com.company.demo6_thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:07
 */
public class DemoRunable {
    public static void main(String[] args) {
        Runableimpl runiml = new Runableimpl();
        Thread t = new Thread(runiml);
        t.start();
    }
}
