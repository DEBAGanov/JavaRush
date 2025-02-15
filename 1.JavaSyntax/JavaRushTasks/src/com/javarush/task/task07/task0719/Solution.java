package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введито 10 цифр: ");
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));

        }

        System.out.println("Числа в обратном порядке:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
