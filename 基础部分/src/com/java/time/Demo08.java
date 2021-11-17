package com.java.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author dong
 * @date 2021/10/7
 * @description  Duration表示两个时刻之间的时间间隔。另一个类似的Period表示两个日期之间的天数
 */
public class Demo08 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        Duration between = Duration.between(start, end);
        System.out.println(between); // PT1235H10M30S

        Period period = LocalDate.of(2021, 10, 1).until(LocalDate.of(2021, 10, 21));
        System.out.println(period); // P20D
    }
}
