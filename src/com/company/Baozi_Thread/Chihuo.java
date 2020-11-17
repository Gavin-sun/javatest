package com.company.Baozi_Thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 15:04
 */
public class Chihuo extends Thread{
    private Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz) {
                if (bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后,吃包子
                System.out.println("吃货正在吃:"+bz.pi+bz.xian+"的包子");
                bz.flag=false;
                bz.notify();
                System.out.println("吃货已经吃完了"+bz.pi+bz.xian+"包子,通知包子铺生产");
                System.out.println("---------------------------------------------");
            }
        }
    }
}
