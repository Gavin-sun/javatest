package com.company.demo1;

import java.util.ArrayList;

public class Manager extends user{
    private int sendmoney;
    private int parts;

    public Manager(){}

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int sendmoney, int parts){
        ArrayList<Integer> rtn = new ArrayList<>();
        int loftMoney = super.getMoney();
        if(sendmoney>loftMoney){
            System.out.println("余额不足");
            return rtn;
        }
        System.out.println("群主余额剩余"+(super.getMoney()-sendmoney));
        super.setMoney(super.getMoney()-sendmoney);
        int avg= sendmoney/parts;
        int mod = sendmoney%parts;
        for (int i = 0; i < parts-1; i++) {
            rtn.add(avg);
        }
        int last = avg+mod;
        rtn.add(last);
        return rtn;
    }
}
