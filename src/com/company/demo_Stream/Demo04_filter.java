package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 11:28
 *
 *          Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
 *          Stream<T> filter(Predicate <? super T> predicate);
 *          filter 方法的参数predicate是一个函数式接口,所以可以传递lambda表达式.对数据进行过滤
 *          Predicate中的抽象方法:
 *              boolean test(T t);
 */
public class Demo04_filter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> s = Stream.of("张三丰","张三","张无忌","赵薇");
        Stream<String> s2 = s.filter((name) -> {
            return name.startsWith("张");
        });
        s2.forEach((name)-> System.out.println(name));
        /*
            stream流属于管道流,只能被消费一次
            第一个Stream流调用完毕方法.数据就会流到下一个Stream上
            第一个就会关闭,不能再使用了
         */
    }
}
