package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo05 {
    public static void main(String[] args) throws InterruptedException {
        /*
        main线程在启动t线程后，可以通过t.join()等待t线程结束后再继续运行
         */

        Thread thread = new Thread(()->{
            System.out.println("hello");
        });
        System.out.println("start");
        thread.start();
        thread.join();
        System.out.println("end");

    }
}
