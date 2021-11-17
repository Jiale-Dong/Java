package com.java.reflection;

import java.lang.annotation.ElementType;

/**
 * @author dong
 * @date 2021/9/27
 * @description   // 哪些类型可以有Class对象：所有类型的Class对象
 */
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;     // 类
        Class c2 = Comparable.class;  // 接口
        Class c3 = String[].class;  //一维数组
        Class c4 = int[][].class;  // 二维数组
        Class c5 = Override.class;  // 注解
        Class c6 = ElementType.class;  // 枚举
        Class c7 = Integer.class;  // 基本数据类型
        Class c8 = void.class;  // void
        Class c9 = Class.class;  // Class

        // ctrl + D 复制上一行
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        // 只要元素类型一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        // 一维数组和二维数组就不是同一个Class
        int[][] c = new int[2][5];

        System.out.println(a.getClass().hashCode()); // 1163157884
        System.out.println(b.getClass().hashCode()); // 1163157884
        System.out.println(c.getClass().hashCode()); // 1956725890
    }
}
