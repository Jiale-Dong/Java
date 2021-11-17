package com.java.thread;

/**
 * @author dong
 * @date 2021/10/7
 * @description   线程优先级
 */
public class Demo04 {

    /*
    优先级高的线程被操作系统调度的优先级较高，操作系统对
    高优先级线程可能调度更频繁，但我们决不能通过设置优先级来
    确保高优先级的线程一定会先执行。
     */
    public static void main(String[] args) {
        System.out.println("main start...");

        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
        t.setPriority(7);
        t.start();
        System.out.println("main end...");
    }
}

