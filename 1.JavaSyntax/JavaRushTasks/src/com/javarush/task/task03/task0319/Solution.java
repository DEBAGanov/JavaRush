package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        System.out.println(name + " получает " + n1 + " через " + n2 + " лет.");

    }
}
