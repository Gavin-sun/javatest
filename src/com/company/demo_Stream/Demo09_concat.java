package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 12:10
 *
 *      把两个流合成一个流
 *      static<T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
 */
public class Demo09_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五");
        Stream<String> stream1 = Stream.of("张三丰", "张三", "张无忌", "赵薇");

        Stream<String> stream2 = Stream.concat(stream, stream1);

        stream2.forEach(name-> System.out.println(name));


    }
}
