package com.company.demo_Lambda;

import java.util.function.Supplier;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 20:19
 *
 *      public interface Supplier<T>
 *          这是一个功能接口，因此可以用作lambda表达式或方法引用的赋值目标。
 *      Supplier<T>接口被称之为生产形接口,指定接口的泛型是什么类型,那么接口中的get方法就会产生什么样的数据
 */
public class Demo04_Supplier {
    //定义一个方法 方法的参数传递Supplier<T>接口 泛型执行String get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s =getString(()->{return "胡歌";});
        String s2 =getString(()->"胡歌");
        System.out.println(s);
        System.out.println(s2);
    }
}
