package com.company.demo_Lambda;

import java.util.function.Consumer;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 20:34
 *
 *      void accept(T t) 对给定的参数执行此操作。
 *      Consumer是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型
 *      具体怎么使用,自定义
 */
public class Demo05_Consumer {
    /*
        定义一个方法
        方法的参数传递一个字符串的姓名
        方法的参数传递Consumer接口,泛型使用String
        可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用method方法,传递字符串姓名,方法的另一个参数是一个consumer接口,是一个函数式接口,可以传递lambda
        method("赵丽颖",(name)->{
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
