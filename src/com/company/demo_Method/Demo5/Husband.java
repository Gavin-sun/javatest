package com.company.demo_Method.Demo5;

import java.util.HashMap;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:16
 */
public class Husband {
    //定义一个买房子方法
    public void buyHouse(){
        System.out.println("北京买一套");
    }

    //定义一个结婚方法,参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }
    //定义一个非常高兴的方法
    public void SoHappy(){
//        marry(()->{
//            this.buyHouse();
//        });

        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().SoHappy();
    }
}
