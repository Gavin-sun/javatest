package com.company.demo_Lambda;

import java.util.function.Function;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 22:31
 *
 *      Function接口中的默认方法,andThen:用来进行组合操作
 *
 *      需求:
 *          把String类型的"123",转换为Integer类型,把转换之后的内容加10;
 *          在把增加了之后的Integer类型的数据,转换为String 类型
 */
public class Demo07_Function_andThen {
    public static void change(String s, Function<String,Integer> fun1, Function<Integer,String> fun2){
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s ="123";
        change(s,(str)->{
            return Integer.parseInt(str)+10;
        },(str)->{
            return str+"";
        });
    }
}
