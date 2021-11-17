package com.java.core;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author dong
 * @date 2021/10/7
 * @description 常用工具类
 */
public class Demo11 {

    public static void main(String[] args) {
        // 1. 绝对值
        int a = Math.abs(-100);
        double b = Math.abs(-7.8);
        System.out.println(a);
        System.out.println(b);

        // 2. 最大最小值
        int c = Math.max(100,99);
        int d = Math.min(99, 2);
        System.out.println(c);
        System.out.println(d);

        // 3. 计算xy次方
        System.out.println(Math.pow(2, 10));

        // 4. 根号
        System.out.println( Math.sqrt(2));
        // ex次方
        System.out.println(Math.exp(2));
        // 以e为底的对数
        System.out.println(Math.log(4));
        // 以10为底的对数
        System.out.println(Math.log10(100));

        System.out.println("==============生成随机数====================");
        System.out.println(Math.random());

        System.out.println("==========[min,max]的随机数====================");
        double x = Math.random();
        double min = 10;
        double max = 50;
        double y = x * (max-min) + min;
        double z = (long) y;
        System.out.println(y);
        System.out.println(z);

        System.out.println("==========Random用来创建 伪 随机数====================");
        // 所谓伪随机数，是指只要给定一个初始的种子，产生的随机数序列是完全一样的
        // 下面以系统时间戳作为种子，得到的伪随机数不同
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));  // 生成一个[0,10)之间的int

        /*
        random.nextLong(); // 8811649292570369305,每次都不一样
        random.nextFloat(); // 0.54335...生成一个[0,1)之间的float
        random.nextDouble(); // 0.3716...生成一个[0,1)之间的double
         */

        // 指定种子 ，获得固定的伪随机数
        Random r = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }

        System.out.println("==========真随机数====================");

        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(100));
    }
}
