package com.java.regular;

import java.util.regex.Pattern;

/**
 * @author dong
 * @date 2021/10/7
 * @description
 */
class Demo01{
    public static void main(String[] args){
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
}
