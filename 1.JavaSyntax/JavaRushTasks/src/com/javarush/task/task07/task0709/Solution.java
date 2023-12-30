package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(r.readLine());
        }

        int minString = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (minString > list.get(i).length()) {
                minString = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minString) {
                System.out.println("Самая маленькая сторока: " + list.get(i));

            }
        }

    }
}


