package com.company.demo_Method.Demo6;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:23
 *
 *              类的构造器引用
 */
public class Demo {
    //定义一个方法,参数传递姓名和personBuilder接口,方法中通过姓名创建person对象
    public static void printName(String name,PersonBuilder p){
        Person person= p.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法,方法的参数是一个函数式接口,可以使用lambda
//        printName("张一山",(name)->{
//           return new Person(name);
//        });
        printName("张一山",Person::new);//使用Person的带餐构造方法,通过传递的姓名创建对象

    }
}
