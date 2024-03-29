package com.java.state;

/**
 * @author dong
 * @date 2021/11/15
 * @description 观察测试线程的状态
 */

public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("/////");
        });

        // 观察状态
        Thread.State state = thread.getState();
        System.out.println(state);

        // 观察启动后
        thread.start();   // 启动线程
        state = thread.getState();
        System.out.println(state);

        while (state!= Thread.State.TERMINATED){
            Thread.sleep(1000);
            state = thread.getState();
            System.out.println(state);  // 输出状态
        }
    }
}
