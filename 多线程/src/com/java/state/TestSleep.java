package com.java.state;

/**
 * @author dong
 * @date 2021/11/15
 * @description 线程休眠
 */

// 模拟网络延时：放大问题的发生性
public class TestSleep implements Runnable{

    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if(ticketNums<=0){
                break;
            }

            // 模拟延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+  "--->拿到了" + ticketNums-- +"座");
        }
    }

    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();

        // 多个线程操作一个对象，线程不安全
        new Thread(testSleep, "老师").start();
        new Thread(testSleep, "小明").start();
        new Thread(testSleep, "中介1").start();
        new Thread(testSleep, "中介2").start();
    }
}
