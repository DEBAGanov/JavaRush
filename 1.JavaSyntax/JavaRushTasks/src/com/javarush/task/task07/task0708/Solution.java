package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        list.add(r.readLine());
        list.add(r.readLine());
        list.add(r.readLine());
        list.add(r.readLine());
        list.add(r.readLine());

        int maxString = 0;

        for (int i = 0; i < list.size(); i++) {
            if (maxString < (list.get(i).length())) {
                maxString = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == maxString) {
                System.out.println("Самые большие строки: " + list.get(i));
            }
        }

    }
}
