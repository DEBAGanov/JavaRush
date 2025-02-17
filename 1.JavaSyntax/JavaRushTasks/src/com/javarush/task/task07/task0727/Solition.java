package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Solition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        System.out.println("Модифичированный список: ");
        for (String s : list) {
            if (s.length() % 2 == 0) {
                System.out.println(s + " " + s);
            } else {
                System.out.println(s + " " + s + " " + s);
            }
        }
    }
}
