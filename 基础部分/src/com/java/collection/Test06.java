package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dong
 * @date 2021/9/29
 * @description 遍历Map
 */
public class Test06 {
    public static void main(String[] args) {

        // HashMap实现了Map，实现了HashSet
        Map<String, String> map = new HashMap<>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");

        System.out.println("====方法一：普通使用=======");
        // 类似于HashMap，map.keySet()取值
        for (String i : map.keySet()) {
            System.out.println("正在迭代：" + "键：" + i + "，对应的值：" + map.get(i));
        }

        System.out.println("====方法二：增强迭代器循环=======");
        // 通过Map.entrySet使用iterator迭代器
        // entry.getKey()和entry.getValue()获取键和值
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
            System.out.println(entry.getKey()+entry.getValue());
        }

        System.out.println("====方法三：增强迭代器循环=======");
        // 推荐，尤其是大容量时
        // 增强for循环
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        // 遍历所有value，仅能通过map.values()获取值
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
