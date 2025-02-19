package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Cat> catsMap = new HashMap<>();
        addCatsToMap(catsMap);
        printCats(catsMap);
    }

    public static void addCatsToMap(HashMap<String, Cat> map) {
        map.put("Барсик", new Cat("Барсик"));
        map.put("Мурзик", new Cat("Мурзик"));
        map.put("Пушок", new Cat("Пушок"));
        map.put("Дымка", new Cat("Дымка"));
        map.put("Кузя", new Cat("Кузя"));
        map.put("Том", new Cat("Том"));
        map.put("Джери", new Cat("Джери"));
        map.put("Котя", new Cat("Котя"));
        map.put("Леопольд", new Cat("Леопольд"));
        map.put("Мурка", new Cat("Мурка"));
    }

    public static void printCats(HashMap<String, Cat> map) {
        for (Map.Entry<String, Cat> cat : map.entrySet()) {
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
