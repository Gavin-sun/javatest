package basis_increase.reflect;

import com.company.demo_Method.test2.Printable;

import java.security.PrivateKey;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 12:33
 */
public class Person {
    private String name;
    private int age;

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                '}';
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

    public void eat(){
        System.out.println("吃吃吃");
    }

    public void eat(String name ){
        System.out.println("吃吃吃"+name);
    }
}
