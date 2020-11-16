package com.company.demo6_thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:42
 */
public class RabImpl implements Runnable{
    private int tickets = 100;
    @Override
    public void run() {
        while(tickets>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
            tickets--;
        }
    }
}
