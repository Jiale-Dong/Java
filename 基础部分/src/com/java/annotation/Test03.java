package com.java.annotation;

import java.lang.annotation.*;

/**
 * @author dong
 * @date 2021/9/27
 * @description 自定义注解
 */

// 自定义注解
public class Test03 {

    // 注解可以显示赋值  如果没有默认值，就必须给注解赋值
    // 注解参数没有先后顺序 比如可以先赋值 age = 1, name=""

    @MyAnnotation02()  // 需要传入参数, 如果注解定义了默认值则可以不传参数
    public void test(){
    }


    // 注解仅定义一个参数，且用value定义，则注解传入的参数可以省略value
    @MyAnnotation03("家乐")
    public static void test2(){

    }

}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation02{
    // 注解的参数：参数类型 + 参数名(); 但他不是一个方法
    String name() default "";
    int age() default 1;
    int id() default -1; //如果默认值为-1，代表不存在  indexof，如果找不到就返回-1

    String[] schools() default {"清华", "北大"};
}


@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03{
    // 如果只有一个值，建议使用value命名,上边可以省略value
    String value();
}
