package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dong
 * @date 2021/9/29
 * @description 遍历ArrayList
 */
public class Test05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHA");
        // 方法一：增强for循环
        for (String s : list) {
            System.out.println("方法一：" + s);
        }

        // 方法二：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("方法二：" + list.get(i));
        }

        // 方法三：使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("方法三" + iterator.next());
        }

    }
}
