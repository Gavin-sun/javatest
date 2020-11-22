package com.company.demo_Method.test2;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 21:45
 */
public class Demo02_ObjectMethodReferce {
    public static void printString(Printable p){
        p.print("hello");
    }

    public static void main(String[] args) {
        //调用printString方法,方法的参数printable是一个函数式接口,所以可以传递Lambda表达式
        printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用MethodRerObject中的成员方法printUpperString
            obj.printUpperString(s);


        });
        /*
                使用方法优化Lambda
                对象是已经存在的MethodRerObject
                成员方法也是已经存在的printUpperString
                使用我们可以使用对象名引用成员方法
         */

        MethodRerObject object = new MethodRerObject();
        printString(object::printUpperString);
    }
}
