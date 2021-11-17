package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo01 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start(); // 启动新线程
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
