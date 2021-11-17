package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description 自动装箱
 */
public class Demo09 {
    public static void main(String[] args) {
        /*
        int变为Integer的赋值写法称为自动装箱（Auto Boxing）
        自动装箱和自动拆箱只发生在编译阶段，目的是为了少写代码
         */

        Integer n = 100;
        int i = n;
        System.out.println(i);

        // 引用类型可以赋值为null，表示空，基本类型不能赋值为null
        Integer n1 = null; // NullPointerException异常
        int i1 = n1;
        System.out.println(i1);
    }
}
