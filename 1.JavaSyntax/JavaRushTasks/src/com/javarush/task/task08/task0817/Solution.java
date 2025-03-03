package com.javarush.task.task08.task0817;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иваноы", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Кузнецов", "Кузьма");
        map.put("Смирнов", "Саша");
        map.put("Федоров", "Федя");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Кузнецов", "Кузьма");
        map.put("Смирнов", "Саша");
        map.put("Федоров", "Федя");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(pair.getValue())) {
                removeItemFromMapByValue(copy, null);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}