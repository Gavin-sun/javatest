package com.company.demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> test1 =new ArrayList<>();
        test1.add(123);

        ArrayList<String> test2=new ArrayList<>();
        test2.add("abc");

        method1(test1);

        method1(test2);

    }
    public static void method1(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
