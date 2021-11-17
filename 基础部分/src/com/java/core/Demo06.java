package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo06 {
    public static void main(String[] args) {
        String[] names = {"Bob","Alice","Grace"};
        StringBuilder builder = new StringBuilder();
        builder.append("hello ");
        for (String name : names) {
            builder.append(name).append(",");
        }
        // 去掉最后的“，”
        System.out.println(builder);
        builder.delete(builder.length()-1, builder.length());
        builder.append("!");
        System.out.println(builder.toString());
    }
}
