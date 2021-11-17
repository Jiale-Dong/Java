package com.java.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dong
 * @date 2021/11/16
 * @description 测试Lock锁
 */

public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements Runnable {

    int ticketName = 1000;
    // 定义lock锁（可重复锁）与synchronized对比；
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
               // 加锁
            try{
                lock.lock();
                if(ticketName>0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "  "+ticketName--);
                } else{
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
