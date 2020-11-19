package com.company.demo_Synchronized.demo_Synchronized_2;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/16 19:42
 *
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第二种方案:使用同步方法
 * 使用步骤:
 *      1.把访问了共享数据的代码抽取出来,放到一个方法中
 *      2.在方法上添加了synchronized 修饰符
 * 格式:
 *      修饰符 synchronized 返回值类型 方法名(参数列表){
 *          可能会出现线程安全问题的代码(访问了共享数据的代码)
 *      }
 */
public class RabImpl implements Runnable{
    //票
    private static int tickets = 100;
    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            payTicketStatic();
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
    public synchronized void payTicket(){
        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
            tickets--;
        }
    }
    /*
    静态的同步方法
    锁对象是谁?
    不能是this
    this 是创建对象之后产生的,静态方法优先于对象
    静态方法的锁对象是本类的class属性-->class文件对象(反射)
     */
    public synchronized static void payTicketStatic(){
        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
            tickets--;
        }
    }
}
