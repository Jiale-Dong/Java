package com.java.demo01;

/**
 * @author dong
 * @date 2021/11/11
 * @description 实现Runnable接口，重写run方法
 */

// 创建线程方式2：实现runnable接口，重写run方法，执行线程 需要runnable接口实现类，调用start方法
public class TestThread02 implements Runnable{
    @Override
    public void run() {
        // run()方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        // 创建runnable接口的实现类对象
        TestThread02 testThread02 = new TestThread02();
        // 创建线程对象、
        Thread thread = new Thread(testThread02);
        thread.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
