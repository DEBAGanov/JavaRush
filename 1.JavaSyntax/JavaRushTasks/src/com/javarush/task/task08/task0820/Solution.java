package com.javarush.task.task08.task0820;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        removeCats(pets, cats);
        printPets(pets);
        printCats(cats);
        printDogs(dogs);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Cat> dogs = new HashSet<>();
        cats.add(new Dog());
        cats.add(new Dog());
        cats.add(new Dog());
        cats.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static void printDogs(Set<Dog> dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public class Cat {

    }

    public class Dog {

    }

}