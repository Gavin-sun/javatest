package com.company.demo_Method.Demo6;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:22
 *          定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建一个person对象返回
    Person builderPerson(String name);
}
