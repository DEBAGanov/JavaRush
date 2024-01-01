package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите строку: ");
            String line = reader.readLine();
            strings.add(0, line);

        }

        System.out.println("Вывод списка: ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
