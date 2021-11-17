package com.java.syn;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author dong
 * @date 2021/11/15
 * @description 测试JUC安全类型的集合
 */

public class TestJUC {

    public static void main(String[] args) {
        // 集合都加泛型
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
