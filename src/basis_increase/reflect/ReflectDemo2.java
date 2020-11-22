package basis_increase.reflect;

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
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
       //0.获取person的class对象
        Class<Person> personClass = Person.class;

        /*
        1.获取成员变量们:
 *              Field[] getFields();
 *              Field getField(String name);
 *
 *              Field[] getDeclaredFields()
 *              Field getDeclaredField(String name);
         */
        Field[] fields = personClass.getFields();//public修饰的成员变量
        for (Field field1 : fields) {
            System.out.println(field1);
        }
        Field field = personClass.getField("a");
        Person p = new Person();
        field.get(p);
        field.set(p,"张爽");
        System.out.println(p);

        Field d = personClass.getDeclaredField("name");
        //加一个暴力反射
        d.setAccessible(true);
        Object o = d.get(p);
        System.out.println(o);

    }

}
