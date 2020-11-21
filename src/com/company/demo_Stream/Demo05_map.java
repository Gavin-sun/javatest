package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 11:53
 *      如果需要将流中的元素映射到另一个流中,可以使用map方法
 *      <R>Stream <R>map(Function<? super T,?extends R> mapper);
 *      该接口需要一个Function 函数式接口参数,可以将当前流中的T类型数据转换为另一种R类型的流
 *      Function中的抽象方法
 *          R apply(T t);
 */
public class Demo05_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream1 = stream.map(num -> Integer.parseInt(num));
        stream1.forEach(num-> System.out.println(num));
    }
}
