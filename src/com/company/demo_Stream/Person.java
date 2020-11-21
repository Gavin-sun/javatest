package com.company.demo_Stream;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/21 20:41
 */
public class Person {
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
