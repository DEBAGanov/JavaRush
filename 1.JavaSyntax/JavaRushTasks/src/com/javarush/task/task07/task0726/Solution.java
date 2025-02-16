package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Cat> cats = new ArrayList<>();

        while (true) {
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }

            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());
            Cat cat = new Cat(name, age, weight, tail);
            cats.add(cat);
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tail;

        public Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail is " + tail;
        }
    }
}
