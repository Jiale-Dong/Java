package com.java.syn;

/**
 * @author dong
 * @date 2021/11/15
 * @description 不安全的买票
 */

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket, "A").start();
        new Thread(buyTicket, "B").start();
        new Thread(buyTicket, "C").start();
    }
}

class BuyTicket implements Runnable{

    // 票
    private int ticketNums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // synchronized 同步方法， 锁的是this
    private synchronized void buy() throws InterruptedException {
        // 判断是否有票
        if (ticketNums <= 0){
            flag=false;
            return;
        }
        // sleep可以放大问题的发生性
        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
