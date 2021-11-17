package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description 包装类型
 */
public class Demo08 {
    public static void main(String[] args) {
        int i = 100;

        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());
        int j = n3.intValue();
        System.out.println(j);

    }
}

