package com.java.demo01;

/**
 * @author dong
 * @date 2021/11/8
 * @description 创建多线程
 * 1. 继承Thread类   2. 重写run方法  3. 调用start()方法启动线程
 */

public class TestThread01 extends Thread{
    @Override
    public void run() {
        // run()方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    // main线程、主线程
    public static void main(String[] args) {

        // 创建一个线程对象
        TestThread01 testThread01 = new TestThread01();

        // 调用start方法开启线程
        testThread01.start();

        // .run则优先执行run方法
        testThread01.run();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
