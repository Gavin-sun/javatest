package com.company.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {
        /*
        * 买牌
        * 洗牌
        *发牌
        * 看牌
        * */
        ArrayList<String> poker =new ArrayList<>();
        String[] Huas = {"♠","□","♥","♧"} ;
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for(String hua:Huas){
            for(String num:numbers){
                poker.add(hua+num);
            }
        }
        Collections.shuffle(poker);
//        System.out.println(poker);
        ArrayList<String> player01 =new ArrayList<>();
        ArrayList<String> player02 =new ArrayList<>();
        ArrayList<String> player03 =new ArrayList<>();
        ArrayList<String> diPai =new ArrayList<>();

        for(int i=0;i<poker.size();i++){
            String s=poker.get(i);
            if(i>=51){
                diPai.add(s);
            }else if(i%3==0){
                player01.add(s);
            }else if(i%3==1){
                player02.add(s);
            }else if(i%3==2) {
                player03.add(s);
            }
        }
        System.out.println("赌神:"+player01);
        System.out.println("赌圣:"+player02);
        System.out.println("赌怪:"+player03);
        System.out.println(diPai);

    }
}
