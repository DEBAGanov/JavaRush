package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i > 0)
            System.out.println(i * 2);
        else if (i < 0)
            System.out.println(i + 1);
        else
            System.out.println(0);
    }
}