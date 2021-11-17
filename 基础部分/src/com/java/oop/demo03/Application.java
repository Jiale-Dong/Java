package com.java.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        Pet cat = new Pet();

        dog.name = "xiaohei";
        dog.age = 5;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);

        cat.name = "xiaobai";
        cat.age = 2;
    }
}



