package basis_increase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 12:30
 *              Class对象功能:
 *              获取功能:
 *              1.获取成员变量们:
 *              Field[] getFields();                //获取public
 *              Field getField(String name);        //获取public
 *
 *              Field[] getDeclaredFields()         //获取所有的包括 private
 *              Field getDeclaredField(String name);
 *
 *              2,获取构造方法们
 *              Constructor<?> [] getConstructors()
 *              Constructor<T>  getConstructor(Class<?>...parameterTypes)
 *
 *              Constructor<T> getDeclareConstructor(Class <?>...parameterTypes)
 *              Constructor<?>[] getDeclareConstructors()
 *
 *              3.获取成员方法们
 *              Method[] getMethods()
 *              Method getMethod(String name,Class <?>...parameterTypes)
 *
 *              Method[] getDeclareMethods()
 *              Method getDeclareMethod(String name,Class <?>...parameterTypes)
 *
 *              4.获取类名
 *              String getName()
 *
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
       //0.获取person的class对象
        Class<Person> personClass = Person.class;

        // *              3.获取成员方法们
        // *              Method[] getMethods()
        // *              Method getMethod(String name,Class <?>...parameterTypes)
        // *
        // *              Method[] getDeclareMethods()
        // *              Method getDeclareMethod(String name,Class <?>...parameterTypes)

        //空参的方法
        // 执行方法,invoke
        Method method1 = personClass.getMethod("eat");
        Person p = new Person();
        method1.invoke(p);

        Method method2 = personClass.getMethod("eat",String.class);
        method2.invoke(p,"饭");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }

        //getName 获取的是全类名
    }

}
