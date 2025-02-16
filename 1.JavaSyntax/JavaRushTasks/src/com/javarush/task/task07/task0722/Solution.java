package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите строки, чтобы завершить ввод, введите end");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String s;

        while (true) {
            s = reader.readLine();
            if (s.equals("end"))
                break;
            list.add(s);
        }
        System.out.println("Выводим строки: ");
        for (String text : list) {
            System.out.println(text);
        }
    }

}
