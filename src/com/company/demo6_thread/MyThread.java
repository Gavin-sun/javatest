package com.company.demo6_thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/13 20:12
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("run:"+i);
        }
    }
}
