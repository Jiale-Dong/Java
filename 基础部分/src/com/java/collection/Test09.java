package com.java.collection;

import java.util.HashMap;

/**
 * @author dong
 * @date 2021/9/29
 * @description   HashMap
 */
public class Test09 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        // 添加键值对 put()方法而不是add()
        hashmap.put(1, "120");
        hashmap.put(2, "121");
        hashmap.put(3, "12");
        hashmap.put(4, "123");
        System.out.println(hashmap);

        System.out.println("========创建String-String=========");
        HashMap<String, String> hashmap1 = new HashMap<>();
        hashmap1.put("one", "120");
        hashmap1.put("two", "121");
        hashmap1.put("three", "122");
        hashmap1.put("four", "123");
        System.out.println(hashmap1);

        System.out.println("========得到元素=========");
        System.out.println(hashmap1.get("four"));

        System.out.println("========删除元素=========");
        System.out.println(hashmap1.remove("three"));

        System.out.println("========删除所有元素=========");
        hashmap1.clear();
        System.out.println(hashmap1);

        System.out.println("========计算散列表大小=========");
        HashMap<Integer, String> hashmap2 = new HashMap<>();
        hashmap2.put(1, "dong");
        hashmap2.put(2, "jia");
        hashmap2.put(3, "le");
        System.out.println(hashmap2.size());

        System.out.println("========迭代HashMap=========");
        // 对hashmap2中的keySet()方法进行遍历
        for (Integer i : hashmap2.keySet()) {
            System.out.println("正在迭代：" + "键：" + i +"，对应的值：" + hashmap2.get(i));
        }
        for (String value : hashmap2.values()) {
            System.out.println("正在输出值：" + value);
        }

    }
}
