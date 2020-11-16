/**
 *
 */
package com.company;
import com.sun.xml.internal.bind.api.impl.NameConverter;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
//import static java.lang.Math.*;


class Ti{
    public final static double PI = 3.1415926535;
    public final static int ss = 123;
    public static double getPI(){
        return PI;
    }
}

public class Main {

//    public  static final double CM_01=1.23;
    public static void main(String[] args) {
        Ti tt = new Ti();
        System.out.println(tt.getPI());
        System.out.println(Ti.ss);
        System.out.println(tt.ss);
//        LocalDate loc = LocalDate.now();
//        int month = loc.getMonthValue();
//        int today = loc.getDayOfMonth();
//        loc = loc.minusDays(today-1);
//        DayOfWeek weekday = loc.getDayOfWeek();
//        int value = weekday.getValue();
//
//        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
//        for(int i=1;i<value;i++){
//            System.out.print("    ");
//        }
//        while(loc.getMonthValue()==month){
//            System.out.format("%3d",loc.getDayOfMonth());
//            if(loc.getDayOfMonth()==today)
//                System.out.print("*");
//            else
//                System.out.print(" ");
//            loc = loc.plusDays(1);
//            if(loc.getDayOfWeek().getValue()==1) System.out.println();
//        }
//        if(loc.getDayOfWeek().getValue()!=1) System.out.println();


//        String s = "123123";
//        for(int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }
	// write your code here

//        Scanner in = new Scanner(System.in);
//        System.out.println("whats your name?");
//        String name = in.nextLine();
//        System.out.println("whats your age?");
//        int age = in.nextInt();
//        System.out.println("hello "+name+",the next year,you are "+(age+1)+" years old");
//        try{
//            BufferedReader in = new BufferedReader(new FileReader("C://Users//Gavin//Desktop//identify.txt"));
//            String str;
//            while((str=in.readLine())!=null){
//                System.out.println(str);
//            }
//        }catch (IOException e){
//
//        }
//
//        try {
//            PrintWriter out = new PrintWriter("C://Users//Gavin//Desktop//identify2.txt", "UTF-8");
//            out.write("hello");
//            out.close();
//        }catch (IOException e){
//
//        }



    }
}
