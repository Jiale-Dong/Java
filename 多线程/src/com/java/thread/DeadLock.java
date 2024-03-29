package com.java.thread;

/**
 * @author dong
 * @date 2021/11/16
 * @description 死锁：多个线程互相抱着对方需要的资源，然后形成僵持
 */

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"灰姑凉");
        Makeup g2 = new Makeup(1,"白雪公主");

        g1.start();
        g2.start();
    }
}

// 口红
class Lipstick{

}

// 镜子
class Mirror{}

class Makeup extends Thread{

    // static来保证需要的资源仅有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice; // 选择
    String girlName;  // 使用化妆品的人

    public Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run(){
        // 化妆
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 化妆
    public void makeUp() throws InterruptedException {
        if(choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName +": 获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(this.girlName +": 获得镜子的锁");
            }
        }else{
            synchronized (mirror){
                System.out.println(this.girlName +": 获得镜子的锁");
                Thread.sleep(1000);
            }
            synchronized (lipstick){
                System.out.println(this.girlName +": 获得口红的锁");
            }
        }
    }
}
