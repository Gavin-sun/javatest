package com.company.demo6_thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/13 20:11
 */
public class DemoThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for(int i=0;i<200;i++){
            System.out.println("main:"+i);
        }
    }
}
