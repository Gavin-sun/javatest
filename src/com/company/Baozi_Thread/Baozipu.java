package com.company.Baozi_Thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 14:46
 *
 * 生产者(包子铺)类:是一个线程类,可以继承Thread
 *     设置线程任务(run):生产包子
 *     对包子的状态进行判断
 *     true:
 *         调用wait方法进入等待状态
 *     false:
 *         包子铺生产包子
 *         增加一些趣味性:交替生产两种包子
 *            有两种状态
 *         包子铺生产好了之后修改包子状态
 *         唤醒吃货线程,让吃货线程吃包子
 *
 *         注意:
 *              包子铺线程和包子线程关系-->通信(互斥)
 *              必须使用同步技术保证两个线程只能有一个执行
 *              锁对象必须保证唯一,可以使用包子对象作为锁对象
 *              包子铺和吃货类需要把包子对象作为参数传进来
 *                  1.需要在成员变量的位置创建一个包子变量
 *                  2.用带参数的构造方法,为这个包子变量赋值
 */
public class Baozipu extends Thread{
    private Baozi bz;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //定义一个变量
        int count =0;
        while(true){
            synchronized (bz){
                if(bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    //生产薄皮三鲜馅包子
                    bz.pi="薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    //生产冰皮 牛肉大葱馅
                    bz.pi="冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产:"+bz.pi+bz.xian+"的包子");
                //生产包子需要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=true;
                bz.notify();
                System.out.println("包子已经生产好了"+bz.pi+bz.xian+"包子,开吃");

            }

        }

    }
}
