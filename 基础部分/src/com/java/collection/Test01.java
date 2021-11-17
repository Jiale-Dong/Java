package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author dong
 * @date 2021/9/29
 * @description  Cellecton接口的常用方法
 */
public class Test01 {

    public static void main(String[] args) {
        /*
        Collecton接口常用的方法
        增加：add(E e) 、addAll(Collection<? extends E> c)
        删除：clear()、remove(Object o)（布尔）
        修改：
        查看：iterator()、size()
        判断：contains(Object o) （布尔）、isEmpty()（布尔） 、equals(Object o)（布尔）
         */

        // 创建对象：接口不能创建对象，利用实现类创建对象
        Collection col = new ArrayList();
        // 调用方法 add(E e)
        // 集合只能存放引用类型的数据，不能是基本数据类型
        // 18基本数据类型，集合能存储是因为基本数据类型自动装箱，对应包装类。int--->Integer

        col.add(18);
        col.add(17);
        col.add(11);
        col.add(18);
        System.out.println(col/*.toString()*/);
        // addAll(Collection<? extends E> c)
        List list = Arrays.asList(new Integer[]{12,5,1,6,2});
        col.addAll(list); // 将另一个集合添加入col中
        System.out.println(col);

        System.out.println("========================================");
        // clear()用法
        // col.clear();
        System.out.println(col);
        System.out.println("集合元素个数" + col.size());
        System.out.println("集合是否为空" + col.isEmpty());

        System.out.println("========================================");
        // remove方法
        boolean isremove = col.remove(12);
        System.out.println(col);
        System.out.println("集合中数据是否被删除" + isremove);

        System.out.println("=========判断两个集合是否一样=============");

        Collection col2= new ArrayList();
        col2.add(18);
        col2.add(17);
        col2.add(11);
        col2.add(18);

        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(17);
        col3.add(11);
        col3.add(18);
        System.out.println("判断两个集合是否一样" + col2.equals(col3));
        // ==比较的是两个集合的地址值，两个对象一定不相等
        System.out.println(col2 == col3);
        System.out.println("是否包含指定元素： " + col3.contains(17));
        System.out.println("是否包含指定元素： " + col3.contains(117));
    }
}
