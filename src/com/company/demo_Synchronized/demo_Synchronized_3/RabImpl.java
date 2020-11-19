package com.company.demo_Synchronized.demo_Synchronized_3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:42
 *
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第三种方案:使用LOCK锁
 * java.util.concurrent.locks.lock接口
 * lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定选择
 * Lock接口中的方法:
 *      void lock() 获取锁
 *      void unlock() 释放锁
 *  java.util.concurrent.Locks.ReentrantLock implements Lock 接口
 *
 * 使用步骤:
 *      1.在成员位置创建一个ReentrantLock对象,
 *      2.在可能出现安全问题的代码前调用lock接口中的lock获取锁
 *      3.在可能出现安全问题的代码后调用unlock接口中的lock释放锁
 */
public class RabImpl implements Runnable{
    //票
    private static int tickets = 100;

    ReentrantLock r = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            r.lock();
            try{
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
                    tickets--;
                }
            }catch (Exception e){
                e.printStackTrace();

            }finally {
                r.unlock();
            }


        }
    }
    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程运行
        同步方法的锁对象是谁?
        就是实现类对象 new RunnableImpl()
        也就是this
     */

}
