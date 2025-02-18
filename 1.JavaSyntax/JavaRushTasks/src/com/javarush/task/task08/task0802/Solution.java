package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, String> plants = new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");

        System.out.println("Всего " + plants.size() + " видов растений.");
        System.out.println("================================================");
        System.out.println("Использование for-each цикла с entrySet():");
        System.out.println("================================================");
        for (Map.Entry<String, String> entry : plants.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        System.out.println("================================================");
        System.out.println("Использование keySet():");
        System.out.println("================================================");
        for (String key : plants.keySet()) {
            String value = plants.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("================================================");
        System.out.println("Использование values():");
        System.out.println("================================================");
        for (String value : plants.values()) {
            System.out.println(value);
        }
    }
}
