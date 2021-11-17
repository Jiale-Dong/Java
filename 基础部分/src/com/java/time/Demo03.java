package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author dong
 * @date 2021/10/7
 * @description Calendar设置时间
 */
public class Demo03 {
    public static void main(String[] args) {
        // Calendar只有一种方式获取，即Calendar.getInstance()
        Calendar c = Calendar.getInstance();
        // 清除所有:
        c.clear();
        // 设置2019年:
        c.set(Calendar.YEAR, 2019);
        // 设置9月:注意8表示9月:
        c.set(Calendar.MONTH, 8);
        // 设置2日:
        c.set(Calendar.DATE, 2);
        // 设置时间:
        c.set(Calendar.HOUR_OF_DAY, 1);
        c.set(Calendar.MINUTE, 1);
        c.set(Calendar.SECOND, 1);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
