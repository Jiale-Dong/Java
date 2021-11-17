package com.java.time;

import java.time.LocalDateTime;

/**
 * @author dong
 * @date 2021/10/7
 * @description   LocalDateTime对时间和日期进行链式调用
 */
public class Demo06 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2021, 12, 31, 12, 21, 12);
        System.out.println(dt); // 2021-12-31T12:21:12
        LocalDateTime dt1 = dt.plusDays(6).minusMinutes(11);
        System.out.println(dt1); // 2022-01-06T12:10:12

        LocalDateTime dt2 = dt.minusMonths(3);
        System.out.println(dt2); // 2021-09-30T12:21:12 九月没有31天，自动减掉

        System.out.println("========调整年月日==============");
        /*
        调整年：withYear()
        调整月：withMonth()
        调整日：withDayOfMonth()
        调整时：withHour()
        调整分：withMinute()
        调整秒：withSecond()
         */
        LocalDateTime dt3 = dt.withMonth(01).withDayOfMonth(01);
        System.out.println(dt3);


    }
}
