package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Барсик", new Cat("Барсик"));
        cats.put("Мурзик", new Cat("Мурзик"));
        cats.put("Пушок", new Cat("Пушок"));
        cats.put("Дымка", new Cat("Дымка"));
        cats.put("Кузя", new Cat("Кузя"));
        cats.put("Том", new Cat("Том"));
        cats.put("Джери", new Cat("Джери"));
        cats.put("Котя", new Cat("Котя"));
        cats.put("Леопольд", new Cat("Леопольд"));
        cats.put("Мурка", new Cat("Мурка"));

        for (Map.Entry<String, Cat> cat : cats.entrySet()) {
            String key = cat.getKey();
            Cat value = cat.getValue();
            System.out.println(key + " - " + value.getName());
        }

    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
