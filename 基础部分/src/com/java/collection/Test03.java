package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dong
 * @date 2021/9/29
 * @description List接口中常用方法
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        List接口常用的方法
        增加：add(int index, E element)
        删除：remove(int index)、remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
        // 接口不能创建对象，用他的实现类创建
        List list =  new ArrayList();
        list.add("13");
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);

        System.out.println("===============================================");
        list.add(3,55);
        System.out.println(list);

        list.set(3,66);
        System.out.println(list);

        // 在集合中存入的是Integer类型数据的时候，调用remove方法调用：remove(int index)
        // 否则直接删除指定元素
        list.remove(2);
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);

        // get元素不能用Integer接收，因为集合含多种类型，只能用Object接收
        Object o =  list.get(0);
        System.out.println(o);

        System.out.println("===============================================");
        // List集合 遍历
        // 方式1：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("正在输出：" + list.get(i));
        }

        System.out.println("===============================================");
        // 方式2：增强for循环
        for (Object o1 : list) {
            System.out.println("方式2正在输出：" + o1);
        }

        System.out.println("===============================================");
        // 方式3：迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("方式3正在输出：" + iterator.next());
        }
    }

}
