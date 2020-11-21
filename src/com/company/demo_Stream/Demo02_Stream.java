package com.company.demo_Stream;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 11:04
 *
 *      java.util.stream.Stream<T>是java8新加入的最常用的流接口,这并不是一个函数式接口
 *
 *      获取一个流很简单,有下面几种常用的方式:
 *          - 所以的Collection集合都可以通过stream默认方法来获取流
 *              default Stream<E> stream()
 *          - Stream接口的静态方法of可以获取数组对应的流
 *              static <T> Stream<T> of(T...values)
 *              参数是一个可变参数,那么我们就可以传递一个数组
 */
public class Demo02_Stream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();

        //获取键,存储到set集合
        Set<String> keySet=map.keySet();
        Stream<String> stream3 = keySet.stream();

        //获取值,存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对(键与值的映射关系 entrySet)
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream5 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,6);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] str = {"12","7777"};
        Stream<String> stream8 = Stream.of(str);
    }
}
