package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 11:22
 *
 *      Stream流中的常用方法_forEach
 *      void forEach(Consumer<? super ?> action);
 *      该方法接受一个Consumer接口函数,会将每一个流元素交给该函数进行处理
 *      Consumer接口是一个消费型的接口,可以传递lambda表达式,消费数据
 *
 *      简单记:
 *          forEach方法,用来遍历流中的数据
 *          是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 */
public class Demo03_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五");
        stream.forEach((name)->{
            System.out.println(name);;});
    }
}
