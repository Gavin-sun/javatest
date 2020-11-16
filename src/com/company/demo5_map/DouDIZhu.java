package com.company.demo5_map;

import java.util.*;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/13 9:27
 *
 * 有序版本:
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.排序
 * 5.看牌
 */
public class DouDIZhu {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        String[] Huas = {"♠","□","♥","♧"} ;
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int times=2;
        map.put(0,"大王");
        map.put(1,"小王");
        for(String num:numbers){
            for(String hua:Huas){
                map.put(times++,hua+num);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> diPai = new ArrayList<>();


        for(int i = 0; i < 54; i++){
            int keynum=list.get(i);
            if(i>50){
                diPai.add(keynum);
                //diPai.add(map.get(keynum));
            }
            else if(i%3==0){
                player1.add(keynum);
            }else if(i%3==1){
                player2.add(keynum);
            }else{
                player3.add(keynum);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        lookPoker("周润发",map,player1);
        lookPoker("周杰伦",map,player2);
        lookPoker("周星驰",map,player3);
        lookPoker("底牌",map,diPai);
    }

    public static void lookPoker(String name,Map<Integer,String> map,List<Integer> list){
        System.out.print(name+":");
        for (Integer key :list){
            String value = map.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
