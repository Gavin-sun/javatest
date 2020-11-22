package basis_increase.annotation;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 14:09
 *
 *   @Deprecated :该注解标注的内容,表示过时
 *   @SuppressWarinings :压制警告
 *
 */
public class AnnoDemo {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){}

    @SuppressWarnings("all")
    public void show2(){}

    @SuppressWarnings("all")
    public void show(){
        show1();

    }
}
