package com.company.demo_Lambda;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 22:03
 *
 *      练习:集合信息筛选
 *      数组中有多条姓名+性别的信息如下:
 *      String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
 *      通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中
 *      需要同时满足两个条件:
 *          1.必须为女生
 *          2.名字要为四个字
 */
public class Demo06_Predicate_test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String>pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
//            String name = s.split(",")[0];
//            String nv = s.split(",")[1];
            if(pre1.and(pre2).test(s)){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        ArrayList<String> list = filter(arr,(str)->{
            String name = str.split(",")[0];
            return name.length()==4;
        },(str)->{
            String nv = str.split(",")[1];
            return nv.equals("女");
        });
        System.out.println(list);

    }
}
