package com.company.demo_Lambda;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 19:54
 */
public class Demo03_Lambda_As_Canshu {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->启动了");
            }
        });

        startThread(()->{System.out.println(Thread.currentThread().getName()+"-->启动了");});
    }
}
