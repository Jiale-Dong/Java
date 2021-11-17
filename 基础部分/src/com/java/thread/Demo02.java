package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description    Java8引入的lambda语法进一步简写为
 */
public class Demo02 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("开启新线程");
        });
        thread.start();
    }
}
