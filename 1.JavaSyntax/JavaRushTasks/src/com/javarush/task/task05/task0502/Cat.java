package com.javarush.task.task05.task0501;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;


    public Cat(){

    }

    public boolean fight (Cat anotherCat){
        return this.weight > anotherCat.weight;
    }

    public static void main(String[] args) {

    }


}
