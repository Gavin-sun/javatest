package com.company.demo_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 12:00
 *      终结方法,计数
 *      long count();
 *
 *
 */
public class Demo06_count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
    }
}
