package basis_increase.reflect;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 12:30
 *
 *          获取Class对象的方式
 *              1.Class.forName("全类名"):将字节码文件加载进内存,返回Class对象
 *                  多用于配置文件,将类名定义在配置文件中,读取文件,加载类
 *
 *              2.类名.class:通过类名的属性class获取
 *                  多用于参数的传递
 *
 *              3.对象.getClass()  getClass()在object类中定义着
 *                  多用于对象的获取字节码的方式
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cas1 = Class.forName("basis_increase.reflect.Person");
        System.out.println(cas1);

        //2.类名.class:通过类名的属性class获取
        Class cas2 = Person.class;
        System.out.println(cas2);

        //对象.getClass()
        Person p = new Person();
        Class cas3 = p.getClass();
        System.out.println(cas3);
    }

}
