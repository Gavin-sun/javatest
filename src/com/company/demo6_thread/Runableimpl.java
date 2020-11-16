package com.company.demo6_thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:03
 */
public class Runableimpl implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
