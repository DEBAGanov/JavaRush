package com.javarush.task.task07.task0715;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, "именно");
            i++; // Увеличиваем i на 1, чтобы пропустить добавленное слово "именно"
        }

        for (String words : list) {
            System.out.println(words);
        }
    }
}
