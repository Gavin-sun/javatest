package com.company.demo_Method;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 21:54
 */
public class Demo03_StaticMethodReference {
    public static int method(int n,Calcable c){
        return c.calsAbs(n);
    }

    public static void main(String[] args) {
        method(-10,(n)->{
            int num=Math.abs(n);
            System.out.println(num);
            return num;
        });

        System.out.println(method(-10,Math::abs));
    }

}
