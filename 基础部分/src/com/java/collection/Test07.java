package com.java.collection;

import java.util.LinkedList;

/**
 * @author dong
 * @date 2021/9/29
 * @description 链表
 */
public class Test07 {
    public static void main(String[] args) {

        System.out.println("=========创建链表===========");
        LinkedList<String> link = new LinkedList<>();
        link.add("google");
        link.add("run");
        link.add("taobao");
        link.add("weibo");
        System.out.println(link);

        System.out.println("=========头部添加元素===========");
        link.addFirst("a");
        System.out.println(link);

        System.out.println("=========尾部添加元素===========");
        link.addLast("z");
        System.out.println(link);

        System.out.println("=========列表开头移除元素===========");
        // 不需要添加参数
        link.removeFirst();
        System.out.println(link);

        System.out.println("=========列表尾部移除元素===========");
        // 不需要添加参数
        link.removeLast();
        System.out.println(link);

        System.out.println("=========获取头部元素===========");
        System.out.println(link.getFirst());

        System.out.println("=========获取尾部元素===========");
        System.out.println(link.getLast());

        System.out.println("=========方法一、遍历元素===========");
        // 遍历元素
        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i));
        }

        System.out.println("=========方法二、遍历元素===========");
        // 遍历元素
        for (String s : link) {
            System.out.println(s);
        }
    }
}
