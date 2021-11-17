package com.java.cooperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dong
 * @date 2021/11/16
 * @description 测试线程池
 */

public class TestPool {
    public static void main(String[] args) {
        // 1. 创建服务，创建线程
        // newFixedThreadPool  参数为：线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        // 2. 关闭链接
        service.shutdown();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }
}

