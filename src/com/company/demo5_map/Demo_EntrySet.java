package com.company.demo5_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/12 13:16
 *
 * 1.使用map集合中的方法entrySet(),把map集合中的多个Entry对象去除来,存储到一个Set集合中
 * 2.遍历Set集合,获取每一个Entry对象
 * 3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo_EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("杨颖",155);
        map.put("赵丽颖",150);
        map.put("佟丽娅",160);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
