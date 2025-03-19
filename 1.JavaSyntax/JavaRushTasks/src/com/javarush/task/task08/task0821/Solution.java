package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();

        // Добавляем людей с одинаковыми фамилиями
        map.put("Иванов", "Петр");
        map.put("Иванов", "Александр");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Смирнов", "Алексей");
        map.put("Кузнецов", "Дмитрий");
        map.put("Смирнов", "Сергей");
        map.put("Попов", "Александр");
        map.put("Соколов", "Дмитрий");
        map.put("Морозов", "Андрей");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
