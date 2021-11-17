package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author dong
 * @date 2021/9/29
 * @description  Collection 接口的遍历方式
 */
public class Test02 {
    public static void main(String[] args) {
        // 多态形式
        Collection col = new ArrayList();

        col.add(18);
        col.add(17);
        col.add(11);
        col.add(18);
        col.add("abc");
        col.add(9.8);

        // 对集合遍历，（对集合中元素进行查看）
        // 1. 普通方式，for循环不可行
        for (int i = 0; i < col.size(); i++) {
            // 不可行
        }
        // 2. 增强for循环
        for (Object o : col) {
            System.out.println(o);
        }
        System.out.println("=======================================");
        // 3. Iterator()迭代器
        Iterator it = col.iterator();
        // 通过hasNext()来判断是否有下一个元素，如果有则返回True，没有则返回False
        while (it.hasNext()){
            // next()首先将元素获取到，然后指针下移
            System.out.println(it.next());
        }
    }
}
