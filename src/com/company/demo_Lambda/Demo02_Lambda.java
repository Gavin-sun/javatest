package com.company.demo_Lambda;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 19:36
 */
public class Demo02_Lambda {
    public static void MessagePrint(int level,MessageBuilder mb){
          if(level==1){
              mb.printMessage();
          }
    }
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 ="world!";
        String s3 ="33333";

        MessagePrint(2,()-> {return( s1+s2+s3);});
        //使用lambda表达式作为参数传递,仅仅是把参数传递到showlog方法中
        //只有满足条件,日志的等级是一级,才会调用MessageBuilder中的方法printMassage
        //才会进行字符串的拼接

    }
}
