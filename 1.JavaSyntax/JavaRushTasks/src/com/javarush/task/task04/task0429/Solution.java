package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int positive = 0;
        int negative = 0;

        if (a > 0)
            positive++;
        else
            negative++;
        if (b > 0)
            positive++;
        else
            negative++;
        if (c > 0)
            positive++;
        else
            negative++;

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
