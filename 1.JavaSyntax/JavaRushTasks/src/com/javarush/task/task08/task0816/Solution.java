package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        // Пример использования методов
        Map<String, Date> map = createMap();
        System.out.println("Люди, родившиеся летом:");
        printSummerPeople(map); // Выводим людей, родившихся летом
        removeAllSummerPeople(map);
        System.out.println("Люди после удаления:");
        printRemainingPeople(map); // Выводим оставшихся людей
    }

    public static Map<String, Date> createMap() {
        Map<String, Date> map = new HashMap<>();
        map.put("Иванов", new Date(90, Calendar.JANUARY, 1));
        map.put("Петров", new Date(85, Calendar.JULY, 15));
        map.put("Сидоров", new Date(92, Calendar.MARCH, 10));
        map.put("Кузнецов", new Date(88, Calendar.AUGUST, 5));
        map.put("Смирнов", new Date(80, Calendar.NOVEMBER, 20));
        map.put("Попов", new Date(95, Calendar.JUNE, 30));
        map.put("Лебедев", new Date(87, Calendar.FEBRUARY, 25));
        map.put("Ковалев", new Date(91, Calendar.APRIL, 12));
        map.put("Зайцев", new Date(89, Calendar.MAY, 1));
        map.put("Морозов", new Date(93, Calendar.SEPTEMBER, 10));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            Date birthDate = entry.getValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int month = calendar.get(Calendar.MONTH);
            if (month == Calendar.JUNE || month == Calendar.JULY || month == Calendar.AUGUST) {
                iterator.remove();
            }
        }
    }

    public static void printSummerPeople(Map<String, Date> map) {
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            Date birthDate = entry.getValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int month = calendar.get(Calendar.MONTH);
            if (month == Calendar.JUNE || month == Calendar.JULY || month == Calendar.AUGUST) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void printRemainingPeople(Map<String, Date> map) {
        for (String name : map.keySet()) {
            System.out.println(name);
        }
    }

}