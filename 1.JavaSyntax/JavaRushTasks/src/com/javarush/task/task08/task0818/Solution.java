package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        System.out.println(map);
        System.out.println("Список после удаления зарплат со значением меньше 500:");
        removeItemFromMap(map);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

    }

    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap();
        map.put("Ivanov", 100);
        map.put("Petrov", 200);
        map.put("Sidorov", 300);
        map.put("Козлов", 400);
        map.put("Сидоров", 500);
        map.put("Петров", 600);
        map.put("Иванов", 700);
        map.put("Сергеев", 800);
        map.put("Гусев", 900);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 500) {
                iterator.remove();
            }
        }

    }

}
