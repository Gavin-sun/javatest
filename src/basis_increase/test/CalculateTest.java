package basis_increase.test;

import basis_increase.junit.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/22 12:11
 */
public class CalculateTest {

    /*
            初始化方法,用于资源申请,所以测试方法执行之前都会使用该方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    @Before
    public void init2(){
        System.out.println("init2...");
    }

    //      释放资源的方法.在所有测试方法执行完成后都会执行此方法
    @After
    public void close(){
        System.out.println("close....");
    }

    @Test
    public void testAdd(){
        Calculate c = new Calculate();
        int result = c.add(1,3);
        //System.out.println(result);

        //使用断言,我断言这个结果是xx
        Assert.assertEquals(4,result);

    }
}
