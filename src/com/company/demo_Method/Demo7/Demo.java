package com.company.demo_Method.Demo7;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:33
 *          数组的构造器应用
 */
public class Demo {
    /*
            定义一个方法
            方法的参数传递数组的长度和ArrayBuilder接口
            方法内部根据ArrayBuilder中的方法创建数组并返回
     */

    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        //调用createArray 方法,传递数组的长度和Lambda表达式

        int[] rtn=createArray(10,(n)->{return new int[n];});
        System.out.println(rtn.length);

        int[] rtn2 = createArray(10,int[]::new);
        System.out.println(rtn2.length);
    }
}
