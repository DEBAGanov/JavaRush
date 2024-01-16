package com.javarush.task.task07.task0716;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list.add("рол");
        list.add("рол");
        list.add("рок");
        fix(list);

        for (String world : list) {
            System.out.println(world);
        }

    }

    public static void fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.contains("р") && (!word.contains("л"))) {
                list.remove(i);
                i--;
            } else if ((!word.contains("р")) && word.contains("л")) {
                list.add(i, word);
                i++;
            }
        }
    }
}
