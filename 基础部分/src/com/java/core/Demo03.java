package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description StringBuilder
 */
public class Demo03 {
    public static void main(String[] args) {
        String s = "";
        /*
        虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，
        然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还
        会影响GC(垃圾回收)效率
         */
        for (int i = 0; i < 1000; i++) {
            s = s + ","+ i;
        }
        System.out.println(s);
    }
}
