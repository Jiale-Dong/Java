package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author dong
 * @date 2021/10/7
 * @description Calendar也可以对日期和时间进行简单的加减
 */
public class Demo04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 清除所有:
        c.clear();
        // 设置年月日时分秒:
        c.set(2019, 10 /* 11月 */, 20, 8, 15, 0);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));

        // 加5天并减去2小时:
        c.add(Calendar.DAY_OF_MONTH, 5);
        c.add(Calendar.HOUR, -2);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
