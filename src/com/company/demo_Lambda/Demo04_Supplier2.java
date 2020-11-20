package com.company.demo_Lambda;

import java.util.function.Supplier;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 20:19
 *
 *      求数组中的最大值
 */
public class Demo04_Supplier2 {
    //定义一个方法 方法的参数传递Supplier<T>接口 泛型执行Integer get方法就会返回一个Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int [] arr = {1,33,454,22,7};
        Integer s =getMax(()->{
            int max= arr[0];
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]) max=arr[i];
            }
            return max;
        });

        System.out.println(s);

    }
}
