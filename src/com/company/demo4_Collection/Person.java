package com.company.demo4_Collection;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/11 16:42
 */
public class Person implements Comparable{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    /*
    this -参数 =升序
    参数- this =降序
    * */
    public int compareTo(Person o){
        return o.getAge()-this.getAge();//年龄升序排序
    }
}
