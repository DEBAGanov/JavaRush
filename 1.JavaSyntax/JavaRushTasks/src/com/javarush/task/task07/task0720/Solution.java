package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число N");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Введите число M");
        int M = Integer.parseInt(reader.readLine());

        List<String> list = new ArrayList<>();

        System.out.println("Введите строки: ");
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String temp = list.remove(0);
            list.add(temp);
        }
        System.out.println("Выводим строки: ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
