package com.java.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dong
 * @date 2021/11/15
 * @description  模拟倒计时
 */

public class TestSleep2 {

    public static void main(String[] args) {
        try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印系统当前时间
        Date date = new Date(System.currentTimeMillis());

//        while (true){
//            try {
//                Thread.sleep(1000);
//                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
//                // 更新当前时间
//                date = new Date(System.currentTimeMillis());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    public static void tenDown() throws InterruptedException {
        int num = 10;

        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num<=0){
                break;
            }
        }
    }
}
