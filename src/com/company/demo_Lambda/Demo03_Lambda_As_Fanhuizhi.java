package com.company.demo_Lambda;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/20 19:54
 *
 *      如果一个方法的返回值类型是一个函数式接口,那么就可以直接返回一个Lambda表达式
 *      当需要通过一个方法来获取java.util.Comparator接口类型的对象作为排序器时,可以调该方法获取
 */
public class Demo03_Lambda_As_Fanhuizhi {
    //定义一个方法,方法的返回值类型使用函数式接口Comparator
    public  static Comparable<String> getComparator(){
//        return new Comparable<String>() {
//            @Override
//            public int compareTo(String o) {
//                return 0;
//            }
//            public int compareTo(String o,String o2) {
//                return o2.length()-o.length();
//            }
//        };
        return (o1)->{return 1;};//this.length()-o1.length();};
    }
}
