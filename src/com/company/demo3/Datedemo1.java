package com.company.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Datedemo1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日(格式:yyyy-MM-DD):");
        String bsdtime = sc.next();
        Date bsd = new SimpleDateFormat("yyyy-MM-DD").parse(bsdtime);
//        SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-DD");
//        Date bsd = spd.parse(bsdtime);
        long begin = bsd.getTime();
        long end = new Date().getTime();
        long gap = end-begin;
        System.out.println(gap/1000/60/60/24);

    }
}
