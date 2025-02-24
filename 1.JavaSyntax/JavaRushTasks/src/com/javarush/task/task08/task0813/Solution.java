package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(createSet());
    }

    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Лес");
            set.add("Ложка");
            set.add("Лань");
            set.add("Лен");
            set.add("Лук");
            set.add("Лупа");
            set.add("Лемур");
            set.add("Лут");
            set.add("Лоб");
            set.add("Люк");
            set.add("Лещь");
            set.add("Лак");
            set.add("Лик");
            set.add("Лицо");
            set.add("Липа");
            set.add("Лось");
            set.add("Лампа");
            set.add("Листва");
            set.add("Лакомка");
            set.add("Лесовоз");
        }
        return set;
    }
}
