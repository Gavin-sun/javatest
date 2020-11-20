package com.company.demo_Lambda;

import java.util.Properties;
import java.util.function.Predicate;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 21:25
 *
 *      java.util.function.Predicate<T> 接口
 *      作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 *
 *      Predicate接口中包含一个抽象方法
 *          boolean test(T t) 用来对指定数据类型数据进行判断的方法
 *              结果:
 *                  符合条件,返回true;
 *                  不符合条件,返回false;
 */
public class Demo06_Predicate {
    /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口,泛型使用String
        使用Predicate的方法test对字符串进行判断,并把判断的结果返回
     */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdse";
        boolean b = checkString(s,str->str.length()>5);
        System.out.println(b);
    }

}
