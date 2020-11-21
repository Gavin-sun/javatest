package com.company.demo_Stream;

import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 12:02
 *          延迟方法,可以继续调用
 *          获取stream的前n项
 *          Stream<T> limit(long maxSize);
 *              参数是一个long型,截取前前n个
 */
public class Demo07_limit {
    public static void main(String[] args) {
        String[] arr = {"123","234","345","456","567"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach(num-> System.out.println(num));
    }
}
