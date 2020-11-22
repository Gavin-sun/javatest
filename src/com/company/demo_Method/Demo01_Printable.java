package com.company.demo_Method;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 21:33
 */
public class Demo01_Printable {
    public static void printString(Printable p){
        p.print("Hello,world");
    }

    public static void main(String[] args) {
        printString((s)-> System.out.println(s));

            /*
            分析:
                Lambda表达式的目的,打印参数传递的字符串
                吧参数s,传递给了System,out 对象,调用out对象中的方法Println对字符串进行输出
                注意:
                    1.System.out 对象是已经存在的
                    2.println方法也是已经存在的
                所以我们可以使用方法引用来优化Lambda表达式
                可以直接使用System.out方法直接引用(调用)println方法
            */
        printString(System.out::println);

    }

}
