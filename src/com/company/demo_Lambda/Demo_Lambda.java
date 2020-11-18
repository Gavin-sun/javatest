package com.company.demo_Lambda;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 19:49
 */
public class Demo_Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

        //使用lambda表达式创建
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
        }).start();
    }
}

