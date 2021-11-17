package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description StringBulider是可变对象
 */
public class Demo04 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(1024);
        for (int i = 0; i < 10; i++) {
            str.append(",");
            str.append(i);
        }

        String s = str.toString();
        System.out.println(s);

        System.out.println("===============链式操作===================");

        /*
        1. append返回this方法
        2. append末尾不加分号；
         */
        StringBuilder str1 = new StringBuilder(1024);
        str1.append("a")
                .append("b")
                .append("c")
                .insert(0, "z");

        System.out.println(str1.toString());

    }
}
