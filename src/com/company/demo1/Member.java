package com.company.demo1;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Random;

public class Member  extends user{
    public Member(){}

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+delta);
        System.out.println("抢到了"+delta+"元");
    }
}
