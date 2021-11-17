package com.java.cooperation;

/**
 * @author dong
 * @date 2021/11/16
 * @description 管程法
 */

public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        new Productor(container).start();
        new Consumer(container).start();

    }
}

// 生产者
class Productor extends Thread{
    SynContainer container;
    public Productor(SynContainer container) {

        this.container = container;
    }

    // 生产
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /*
            这里会先输出生产第11只鸡是因为,缓冲区已经取走了第10只鸡,
            但是还没有打印出来,生产者已经收到了生产第十一只鸡的信号
             */
            System.out.println("生产了"+ i +"鸡");
            container.push(new Chicken(i));
        }
    }
}

// 消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container) {

        this.container = container;
    }

    // 消费
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->"+ container.pop().id +"鸡");
        }
    }
}

// 产品
class Chicken{
    int id;   // 产品编号

    public Chicken(int id) {
        this.id = id;
    }
}

// 缓冲区
class SynContainer{
    // 需要一个容器大小
    Chicken[] chickens = new Chicken[10];

    // 容器计数器
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken){

        // 如果容器满了，需要等待消费者消费
        if(count==chickens.length){
            // 生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果没有满，需要向容器中丢入产品
        chickens[count] = chicken;
        count++;

        // 通知消费者消费
        this.notifyAll();
    }

    //
    public synchronized Chicken pop(){
        // 判断能否消费
        if(count==0){
            // 等待生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果可以消费
        count--;
        Chicken chicken = chickens[count];


        // 吃完了通知生产者生产
        this.notifyAll();
        return chicken;
    }

}
