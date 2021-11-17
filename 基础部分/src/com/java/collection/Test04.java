package com.java.collection;

import java.util.ArrayList;

/**
 * @author dong
 * @date 2021/9/29
 * @description 泛型
 */
public class Test04 {
    public static void main(String[] args) {

        // 创建一个ArrayList集合，向这个集合中存入学生的成绩
        ArrayList a1 = new ArrayList();
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add("error");

        for (Object o : a1) {
            System.out.println("输出集合的元素：" + o);
        }

        System.out.println("============JDK1.5之后开始使用泛型===================");
        // 加入泛型的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不会加入这个集合

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(12);
        a2.add(13);
        a2.add(14);
        a2.add(15);
        a2.add(17);

        for (Integer i : a2) {
            System.out.println("定义泛型进行输出" + i);
        }

    }
}
