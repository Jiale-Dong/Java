package com.java.collection;

import java.util.HashSet;

/**
 * @author dong
 * @date 2021/9/29
 * @description    HashSet是一个不允许有重复元素的集合
 */
public class Test08 {
    public static void main(String[] args) {
        HashSet<String> haset = new HashSet<>();
        haset.add("google");
        haset.add("run");
        haset.add("Taobao");
        haset.add("zhihu");
        haset.add("run"); // 重复的元素不会被添加
        System.out.println(haset);

        System.out.println("=============删除某个元素==============");
        haset.remove("Taobao");
        System.out.println(haset);

        System.out.println("=============删除所有元素==============");
        haset.clear(); // 删除所有元素
        System.out.println(haset);

        System.out.println("=============计算大小==============");
        HashSet<String> haset1 = new HashSet<>();
        haset1.add("google");
        haset1.add("run");
        haset1.add("Taobao");
        haset1.add("zhihu");
        System.out.println(haset1.size());

        System.out.println("=============遍历HashSet==============");
        for (String s : haset1) {
            System.out.println(s);
        }
    }
}
