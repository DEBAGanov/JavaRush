package com.javarush.task.task05.task0514;

public class Person {
    Srting mame;
    int age;

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Иван", 33);
    }
}
