package com.javarush.task.task07.task0707;

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeeee");

        System.out.println("Размер списка: " + list.size());

        for (String string : list) {
            System.out.println(string);
        }

    }
}
