package com.company.demo5_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/12 9:38
 *
 * 1.创建一个map集合
 * 2.使用map集合中的KeySet() 方法把key放入Set集合中
 * 3.使用迭代器来遍历集合
 */
public class Demo_Setmap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("杨颖",155);
        map.put("赵丽颖",150);
        map.put("佟丽娅",160);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String name= it.next();
            System.out.println(name+"="+map.get(name));;
        }
    }
}
