package com.java.demo01;

import sun.security.krb5.internal.TGSRep;

/**
 * @author dong
 * @date 2021/11/12
 * @description 模拟龟兔赛跑
 */

public class Race implements Runnable{

    // 胜利者
    private static String winner;

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            // 模拟兔子休息  每十步睡一次
            if (Thread.currentThread().getName().equals("兔子") && i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 判断比赛是否结束
            boolean flag = gameOver(i);
            // 结束比赛
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--->跑了" + i+"步");
        }
    }

    // 判断是否完成比赛
    private boolean gameOver(int steps){
        // 判断是否有胜利者
        if (winner!=null){  // 如果不为空，比赛完成
            return true;
        }else{
            if (steps>=100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is : " + winner);
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
