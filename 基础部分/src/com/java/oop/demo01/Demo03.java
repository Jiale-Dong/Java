package com.java.oop.demo01;

public class Demo03 {
    public static void main(String[] args) {
        // 实际参数和形式参数的类型要对应
        int add = Demo03.add(2, 4);
        //int add = Demo03.add(2,4);
        System.out.println(add); //快捷键: sout
    }

    // 修饰符 修饰符 数据类型 方法(参数1, 参数2)
    public static int add(int a, int b) {
        return a + b;
    }
}
