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
 *        default Predicate<T> negate(){
 *        return (t)->!test(t);
 *  }
 *          定义一个方法,方法的参数,传递字符串
 *         传递1个Predicate接口
 *             一个判断字符串长度是否大于5
 *         使用Predicate的方法test对字符串进行判断,并把判断的结果返回
 */
public class Demo06_Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre){
        //return !pre.test(s);//and 操作操作
        return pre.negate().test(s);

    }

    public static void main(String[] args) {
        String s = "abcdse";
        boolean b = checkString(s,str->str.length()>5);
        System.out.println(b);
    }

}
