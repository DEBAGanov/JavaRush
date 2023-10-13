package com.javarush.task.task06.task0604;

public class Cat {
    public static int catCoun = 0;

    public Cat() {
        catCoun++;
    }

    public void finalize() {
        catCoun--;
    }

    public static void main(String[] args) {

    }
}
