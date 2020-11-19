package com.company.demo_Synchronized.demo_Synchronized_2;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:44
 */
public class DemoTicket {
    public static void main(String[] args) {
        RabImpl rab = new RabImpl();
        Thread t0 =new  Thread(rab);
        Thread t1 =new  Thread(rab);
        Thread t2 =new  Thread(rab);

        t0.start();
        t1.start();
        t2.start();
    }
}
