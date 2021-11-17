package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
        main start会先打印外，main end打印在thread run之前、
        thread end之后或者之间，都无法确定。因为从t线程开始运行以后（与main线程），
        两个线程就开始同时运行了，并且由操作系统调度，程序本身无法确定线程
        的调度顺序。
         */
        System.out.println("main start...");
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
