package com.company.demo4_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/11 16:55
 */
public class Demo_Collection_2 {
    public static void main(String[] args) {
        Person p1 =new Person("小明",13);
        Person p2 =new Person("小小明",12);
        Person p3 =new Person("大明",16);
        Person p4 =new Person("2大明",16);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
            //    return o1.getAge()-o2.getAge();//升序
               int result =o1.getAge()-o2.getAge();
               if(result==0){
                   result = o1.getName().charAt(0)-o2.getName().charAt(0);
               }
               return result;
            }
        });
        System.out.println(list);

    }
}
