package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        System.out.println("All pets:");
        printPets(pets);
        removeCats(pets, cats);
        System.out.println("Pets after removing cats:");
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
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        @Override
        public String toString() {
            return "Dog";
        }
    }

}