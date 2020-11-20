package com.company.demo_Lambda;

import java.util.function.Consumer;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 20:46
 *      连接两个Consumer接口
 *      con1.accept(s);
 *      con2.accept(s);
 *      等同于 con1.andThen(con2).accept(s)
 *
 */
public class Demo05_andThen {
    public static void method(String name, Consumer<String> con1,Consumer<String> con2){
        con1.accept(name);
        con2.accept(name);
        //con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method("Hello",(t)->{
            System.out.println(t.toUpperCase());;},(t)->{
            System.out.println(t.toLowerCase());;});
    }
}
