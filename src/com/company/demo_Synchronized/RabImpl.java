package com.company.demo_Synchronized;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:42
 *
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第一种方案:使用同步代码块
 * 格式:
 *      synchronized(锁对象){
 *          可能会出现线程安全问题的代码
 *      }
 *      1.通过代码块中的锁对象,可以使用任意的对象
 *      2.但是必须保证多个线程实现的锁对象是一个
 *      3.锁对象作用:
 *          把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class RabImpl implements Runnable{
    //票
    private int tickets = 100;
    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
                    tickets--;
                }

            }

        }
    }
}
