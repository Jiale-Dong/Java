package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dong
 * @date 2021/10/7
 * @description  Date
 */
public class Demo01 {
    public static void main(String[] args) {
        // 获取当前时间(获取当前系统时间(毫秒数))
        // 方式一:
        Date date = new Date();
        System.out.println(date.getTime());

        // 方式二
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getYear() + 1900); // 必须加上1900
        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
        System.out.println(date.getDate()); // 1~31，不能加1
        // 转换为String:
        System.out.println(date.toString());
        // 转换为GMT时区:
        System.out.println(date.toGMTString());
        // 转换为本地时区:
        System.out.println(date.toLocaleString());


        // 获取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 2021-10-07 16:20:24
        System.out.println(df.format(date));

        /*
        M：输出9
        MM：输出09
        MMM：输出Sep
        MMMM：输出September
         */
        SimpleDateFormat df1 = new SimpleDateFormat("E MMM dd, yyyy"); // 星期四 十月 07, 2021
        System.out.println(df1.format(date));
    }
}
