package com.java.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @date 2021/9/28
 * @description   通过反射获取泛型
 */
public class Test10 {
    // Map泛型参数
    public void test01(Map<String,User> map, List<User> list){
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test10.class.getMethod("test01", Map.class, List.class);
        // 通过方法获取它的泛型的参数化类型

        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            // 通过instanceof判断是不是参数化类型
            if(genericParameterType instanceof ParameterizedType){
                // 如果是参数化类型，强转为参数化类型，并且获得真实参数的方法，获得数组
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                // 最后打印出结果
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);

                }
            }
        }
        method = Test10.class.getMethod("test02", null);
        Type genericReturnType = method.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
