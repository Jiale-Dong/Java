package com.java.thread;

import java.time.LocalTime;

/**
 * @author dong
 * @date 2021/10/7
 * @description 守护线程
 */
public class Demo09 {
    public static void main(String[] args) {
        Thread t = new TimerThread();
        t.setDaemon(true);
        t.start();
    }
}


class TimerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
