package com.company.demo_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 20:45
 *
    *          有两个ArrayList集合存储队伍当中的多个成员姓名,要求使用传统的for循环执行下列操作步骤
 *  *          1.第一个队伍只要名字为3个字的成员名字,存储到一个新集合中
 *  *          2.第一个队伍筛选之后只要前三个人,存储到一个新集合中
 *  *          3.第二个队伍只要姓张的成员姓名,存储到一个新集合中
 *  *          4.第二个队伍筛选之后不要前2个人,存储到一个新集合中
 *  *          5.将两个队伍合并为一个队伍,存储到一个新集合中
 *  *          6.根据姓名创建person对象,存储到一个新集合中
 *  *          7.打印整个队伍的Person对象信息
 */
public class Demo_Test_Stream {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("孔子");
        one.add("洪七公");
        //1.第一个队伍只要名字为3个字的成员名字,存储到一个新集合中
        //2.第一个队伍筛选之后只要前三个人,存储到一个新集合中

        Stream<String> onestream = one.stream().filter((name) -> name.length() == 3).limit(3);

        //3.第二个队伍只要姓张的成员姓名,存储到一个新集合中
        //4.第二个队伍筛选之后不要前2个人,存储到一个新集合中
        ArrayList<String> two = new ArrayList<>();
        two.add("迪丽热巴");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("赵四");
        two.add("张天爱");
        two.add("张二狗");

        Stream<String> twostream = two.stream().filter((name) -> name.startsWith("张")).skip(2);

        // 5.将两个队伍合并为一个队伍,存储到一个新集合中
        // 6.根据姓名创建person对象,存储到一个新集合中
        // 7.打印整个队伍的Person对象信息

        Stream.concat(onestream, twostream).map(name->new Person(name)).forEach(p-> System.out.println(p));


    }
}
