package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description 设置中断标志位
 */
public class Demo08 {
    public static void main(String[] args)  throws InterruptedException {
        HelloThread1 t = new HelloThread1();
        t.start();
        Thread.sleep(1);
        t.running = false; // 标志位置为false
    }
}

class HelloThread1 extends Thread {
    public volatile boolean running = true;
    @Override
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}