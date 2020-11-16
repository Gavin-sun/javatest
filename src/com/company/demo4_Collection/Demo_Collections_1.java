package com.company.demo4_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Collections_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add在数量多的时候无法很便利的创建元素
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//        System.out.println(list);

        //一次增加多个元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        //打乱
        Collections.shuffle(list);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        //public static<T> void sort(List<T> list); 排序
        Collections.sort(list2);
        System.out.println(list2);

        //String类型的数据也可以排序,是升序

        //被排序集合里面使用的元素,必须实现Comparable
        //如果重写了排序方法compareto 就可以按照自己的想法


    }

}
