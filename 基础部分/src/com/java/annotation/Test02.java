package com.java.annotation;

import java.lang.annotation.*;

/**
 * @author dong
 * @date 2021/9/27
 * @description   测试元注解
 */


public class Test02 {

    @MyAnnotation
    public void test(){

    }

}

// 定义一个注解, 一个类里边只能有一个public，下边注解的定义不能加public
// Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention表示我们的注解在什么时候还有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// 表示是否将我们的注解生成在JAVAdoc中
@Documented

// Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
