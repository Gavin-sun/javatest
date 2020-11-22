package basis_increase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

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
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
       //0.获取person的class对象
        Class<Person> personClass = Person.class;

        // 2,获取构造方法们
        // *              Constructor<?> [] getConstructors()
        // *              Constructor<T>  getConstructor(Class<?>...parameterTypes)
        // *
        // *              Constructor<T> getDeclareConstructor(Class <?>...parameterTypes)
        // *              Constructor<?>[] getDeclareConstructors()

        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //创建对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("张三", 123);
        System.out.println(obj);

        Object o = personClass.newInstance();
        System.out.println(o);
    }

}
