package com.java.state;

/**
 * @author dong
 * @date 2021/11/15
 * @description 测试守护线程
 */


public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true);  // 守护线程，默认是FALSE：表示是用户线程
        thread.start();

        new Thread(you).start();  // 用户线程启动
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护着你");
        }
    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心活着");
        }
        System.out.println("===============goodbye world=================");
    }
}