package com.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo05 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   // 当前日期2021-10-07
        System.out.println(date);

        LocalTime time = LocalTime.now(); // 16:55:27.412
        System.out.println(time);

        LocalDateTime dt = LocalDateTime.now(); //2021-10-07T16:56:08.294
        System.out.println(dt);

        // 顺序获取年月日会有延迟，使用以下方法
        LocalDateTime dt1 = LocalDateTime.now(); // 当前日期和时间
        LocalDate d = dt1.toLocalDate(); // 转换到当前日期
        LocalTime t = dt1.toLocalTime(); // 转换到当前时间

        // 指定日期和时间
        LocalDateTime dt2 = LocalDateTime.of(2021,10,07,17,00,32);
        System.out.println("dt2 " + dt2);

        // 字符串转换为时间
        LocalDateTime dt3 = LocalDateTime.parse("2019-11-19T15:16:17");
        System.out.println("dt3 " + dt3);

        // DateTimeFormatter自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));  // 2021/10/07 17:08:01

        // 用自定义格式解析:
        LocalDateTime dt4 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt4); // 2019-11-30T15:16:17

        System.out.println("========LocalDateTime对时间和日期进行链式调用=================");
    }
}
