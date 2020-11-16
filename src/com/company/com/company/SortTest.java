package com.company.com.company;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("harry",300,1,2,3);
        staff[1] = new Employee("arry",202,1,2,3);
        staff[2] = new Employee("varry",3900,1,2,3);

        Arrays.sort(staff,(u1,u2)->u1.getName().length()-u2.getName().length());

        for(Employee e:staff){
            System.out.println("name="+e.getName());
        }
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) System.out.println(i);
        };
        runnable.run();
    }
}
