package com.company.demo_Lambda;

import java.util.function.Consumer;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 21:20
 */
public class Demo05_Simple_out {
    public static void printInfo(String [] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        printInfo(arr,(t)->{
            System.out.print("姓名:"+t.split(",")[0]+"\t");
        },(t)->{
            System.out.println("性别:"+t.split(",")[1]);
        });
    }

}
