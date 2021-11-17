package com.java.demo01;

/**
 * @author dong
 * @date 2021/11/12
 * @description 初识并发问题
 */

// 多个线程操作同一个对象
// eg：买火车票
// 发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestThread03 implements Runnable{

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
        TestThread03 testThread03 = new TestThread03();

        new Thread(testThread03,"老师").start();
        new Thread(testThread03,"小明").start();
        new Thread(testThread03,"中介1").start();
        new Thread(testThread03,"中介2").start();
        new Thread(testThread03,"中介3").start();
        new Thread(testThread03,"中介4").start();
        new Thread(testThread03,"中介5").start();
        new Thread(testThread03,"中介6").start();
        new Thread(testThread03,"中介7").start();
        new Thread(testThread03,"中介8").start();
        new Thread(testThread03,"中介9").start();
        new Thread(testThread03,"中介10").start();
        new Thread(testThread03,"中介11").start();
        /*
        发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
            老师--->拿到了2座
            中介10--->拿到了4座
            中介11--->拿到了6座
            中介7--->拿到了9座
            小明--->拿到了10座
            中介6--->拿到了8座
            中介8--->拿到了10座
            中介1--->拿到了5座
            中介5--->拿到了7座
            中介2--->拿到了3座
            中介4--->拿到了0座
            中介3--->拿到了1座
            中介9--->拿到了-2座
            老师--->拿到了-1座
         */
    }
}
