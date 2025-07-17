package com.qtg.polymorphic;

public class Animal {
    String name;
    int age;
    public Animal() {

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("动物在吃");
    }
}
