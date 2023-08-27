package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader.readLine());

        if ((d % 5) < 3.0)
            System.out.println("зелёный");
        else if (((d % 5) >= 3.0) && ((d % 5) < 4.0))
            System.out.println("желтый");
        else
            System.out.println("красный");

    }

}
