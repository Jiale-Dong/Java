package com.java.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author dong
 * @date 2021/9/28
 * @description 反射操作注解
 */
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.Student2");

        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解的value的值
        jiale jiale = (jiale)c1.getAnnotation(jiale.class);
        String value = jiale.value();

        System.out.println(value);

        // 根据name属性获得name属性的注解
        Field f = c1.getDeclaredField("name");
        jialeField annotation = f.getAnnotation(jialeField.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@jiale("db_student")
class Student2{
    @jialeField(columnName = "db_id",type="int",length = 10)
    private int id;
    @jialeField(columnName = "db_age",type="int",length = 10)
    private int age;
    @jialeField(columnName = "db_name",type="varchar",length = 3)
    private String name;

    // 创建类时候就需要构造器

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


// 类名的注解
@Target(ElementType.TYPE) // 作用在TYPE上
@Retention(RetentionPolicy.RUNTIME)
@interface jiale{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD) // 仅在属性上有效
@Retention(RetentionPolicy.RUNTIME)
@interface jialeField{
    String columnName();
    String type();
    int length();
}


