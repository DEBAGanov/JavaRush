package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map));
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }

    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Кузнецов", "Кузьма");
        map.put("Смирнов", "Сергей");
        map.put("Попов", "Павел");
        map.put("Соколов", "Сергей");
        map.put("Михайлов", "Михаил");
        map.put("Федоров", "Федор");
        map.put("Морозов", "Максим");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}