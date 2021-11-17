package com.java.core;

import java.util.StringJoiner;

/**
 * @author dong
 * @date 2021/10/7
 * @description StringJoiner分隔符拼接数组
 */
public class Demo07 {
    public static void main(String[] args) {
        String[] names = {"Bob","Alice","Grace"};
        StringJoiner joiner = new StringJoiner(";");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner.toString());


        // StringJoiner指定开头和结尾(分隔符，首，尾字符)
        StringJoiner joiner1 = new StringJoiner(";","hello ","!");
        for (String name : names) {
            joiner1.add(name);
        }
        System.out.println(joiner1.toString());

        // String.join()静态方法
        String[] name1 = {"Bob", "Alice", "Grace"};
        String s = String.join(", ", name1);
        System.out.println("join静态方法：" + s);

    }
}
