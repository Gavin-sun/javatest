package com.company.demo4_Collection;



public class Variable_parameter {
    public static void main(String[] args) {


    }
    // 1.一个参数列表只能有一个可变参数
    // 2.如果参数列表有多个,那么参数列表写在最后
    public static int add(int...arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
