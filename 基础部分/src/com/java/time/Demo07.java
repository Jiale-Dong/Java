package com.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
public class Demo07 {
    public static void main(String[] args) {
        // 本月第一天时刻
        LocalDateTime first = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(first);

        // 本月最后一天
        LocalDate last = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(last);

        // 根据某个时间获取所在月
        LocalDate dt = LocalDate.of(2021,7,31);
        System.out.println(dt.getMonth());

        LocalDate first1 = LocalDate.now().withDayOfYear(1);
        System.out.println(first1);
        LocalDate last1 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(last1);

    }
}
