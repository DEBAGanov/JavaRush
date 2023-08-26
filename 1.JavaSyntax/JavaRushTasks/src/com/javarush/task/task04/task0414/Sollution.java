package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sollution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(reader.readLine());
        if ((g % 4) == 0) {
            if (((g % 100) == 0) && ((g % 400) != 0))
                System.out.println("колличество дней в году:  365");
            else
                System.out.println("Колличество дней в году:  366");
        } else
            System.out.println("количество дней в году: 365");

    }
}
