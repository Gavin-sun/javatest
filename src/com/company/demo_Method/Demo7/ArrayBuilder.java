package com.company.demo_Method.Demo7;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:31
 *          定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    //定义一个创建int数组类型的方法,参数传递数组的长度,返回创建好的int数组
    int [] builderArray(int length);

}
