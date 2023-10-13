package com.javarush.task.task06.task0603;


public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50_000; i++) {
            new Cat();
        }
        for (int i = 0; i < 50_000; i++) {
            new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}