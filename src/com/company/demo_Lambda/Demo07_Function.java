package com.company.demo_Lambda;

import javax.lang.model.element.NestingKind;
import java.util.function.Function;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 22:17
 *
 *          java.util.function.Function<T,R> 接口用来根据一个类型的数据得到拧一个类型的数据,前者称为前置条件,后者称为后置条件
 *
 *      抽象方法:apply
 *          Function接口中最主要的抽象方法为: R apply(T t) 根据t参数的类型获取类型R的结果
 *          使用的场景 将String 类型转换为 Integer类型
 */
public class Demo07_Function {
    /*
            定义一个方法
            方法的参数传递一个字符串类型的整数
            方法的参数传递一个Function接口,泛型使用<String,Integer>
            使用Function接口中方法apply,把字符串类型的整数转换为Integer类型的整数
     */
    public static void change(String s , Function<String,Integer> fun){
        System.out.println(fun.apply(s));
    }

    public static void main(String[] args) {
        String s= "1234";
        change(s,(str)->{
            return Integer.parseInt(str);
        });
    }
}
