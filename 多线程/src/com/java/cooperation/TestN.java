package com.java.cooperation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author dong
 * @date 2021/11/16
 * @description 多线程总结: 线程实现的三种方式
 */

public class TestN {
    public static void main(String[] args) {

        new Thread(new MyThread1()).start();
        new Thread(new MyThread2()).start();

        FutureTask<Object> futureTask = new FutureTask<Object>(new MyThread3());
        new Thread(futureTask).start();

        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// 1.集成Thread类型
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}

// 2.实现Runnable接口
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread2");
    }
}

// 3.实现Callable接口
class MyThread3 implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("MyThread3");
        return "100";
    }
}

