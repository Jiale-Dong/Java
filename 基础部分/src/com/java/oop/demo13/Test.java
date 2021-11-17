package com.java.oop.demo13;

/**
 * @author dong
 * @date 2021/9/26
 * @description   匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        // 匿名内部类
        new Apple().eat();

        UserService userService = new UserService(){

            public void hello() {

            }
        };

    }
}

class Apple{
    public void eat(){
        System.out.println("匿名内部类");
    }
}

interface UserService{
    void hello();
}



