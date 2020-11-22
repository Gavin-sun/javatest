package com.company.demo_Method.Demo4;


/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 22:02
 */
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello 我是man!");
    }

    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法,Greetable是一个函数式接口,所以可以传递lambda
//        method(()->{
//            Human h =new Human();
//            h.sayHello();
//        });

        //有子父类关系,所以super代表父类,直接用super调用父类的方法
//        method(()->{
//            super.sayHello();
//        });

        /*使用super引用类的成员方法
              super是已经存在的
              父类的方法sayHello也是存在的
              可以直接用method使用父类的方法
         */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }

}
