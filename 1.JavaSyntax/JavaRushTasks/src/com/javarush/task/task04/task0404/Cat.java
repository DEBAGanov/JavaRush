package com.javarush.task.task04.task0404;
public class Cat {
    private static int catsCount = 0;

    public static addNewCat (){
        catsCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.addNewCat();
        System.out.println(Cat.catsCount);
    }
}
