package com.company.demo4_Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/11 16:43
 *
 * 实现 自定义的排序.用Collection的方法
 */
public class Demo_Collection_1 {
    public static void main(String[] args) {
        Person p1 =new Person("小明",13);
        Person p2 =new Person("小小明",12);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
