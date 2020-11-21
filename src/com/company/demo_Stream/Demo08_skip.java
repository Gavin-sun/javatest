package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 12:06
 *
 *      skip跳过第几个
 *      Stream<T> skip(long n);
 *      如果超过当前长度,就返回一个长度为0的流
 *
 */
public class Demo08_skip {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream1 = stream.skip(2);
        System.out.println(stream1.count());
    }
}
