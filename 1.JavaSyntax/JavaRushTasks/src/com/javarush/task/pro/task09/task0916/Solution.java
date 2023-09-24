package com.javarush.task.pro.task09.task0916;

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Ivan", 5000));
    }

    public static String format(String name, int salary) {
        String s = "Меня зовут %s. Я буду зарабатывать %d $ в месяц.";
        return String.format(s, name, salary);
    }

}
