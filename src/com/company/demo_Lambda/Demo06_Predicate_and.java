package com.company.demo_Lambda;

import java.util.function.Predicate;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 21:25
 *
 *      java.util.function.Predicate<T> 接口
 *      作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 *
 *        default Predicate<T> or (Predicate<? super T> other){
 *        Objects.requireNonNull(other);
 *        return (t)->this.test(t) || other.test(t);
 *  }
 *    方法内部的两个条件也是通过 && 连接起来的
    /*
        定义一个方法,方法的参数,传递字符串
        传递两个Predicate接口
            一个判断字符串长度是否大于5
            一个判断字符串中是否有a
        使用Predicate的方法test对字符串进行判断,并把判断的结果返回
     */
public class Demo06_Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre,Predicate<String> pre2){
        //return pre.test(s) || pre2.test(s);//and 操作操作
        return pre.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "22cdse";
        boolean b = checkString(s,str->str.length()>5,str->str.contains("a"));
        System.out.println(b);
    }

}
