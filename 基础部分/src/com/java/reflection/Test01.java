package com.java.reflection;

/**
 * @author dong
 * @date 2021/9/27
 * @description 什么叫反射
 */
public class Test01 /* extends Object */{
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象
        // Class类从Object中获得,根据类名forname获得定义的类
        Class c1 = Class.forName("com.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.reflection.User");
        Class c3 = Class.forName("com.reflection.User");
        Class c4 = Class.forName("com.reflection.User");

        // 看看这几个类是否一样，打印哈希code
        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode()); //hashCode值都一样
        System.out.println(c3.hashCode());
        System.out.println(c4 .hashCode());

    }
}

// 实体类: pojo, entity（与数据库对应）
class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void priavteMethod(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}