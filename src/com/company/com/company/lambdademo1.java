package com.company.com.company;

import java.sql.SQLOutput;

public class lambdademo1 {
    private  static interface Calculate{
        int calculate(int a,int b);
    }

    public static void main(String[] args) {
        Calculate ca = lambdademo1::calculate;
        System.out.println(calculate(10,12));
    }

    private static int calculate(int x,int y){
        if(x>y) {
            return x - y;
        }else if(x<y){
            return y-x;
        }
        return x+y;
    }
}
