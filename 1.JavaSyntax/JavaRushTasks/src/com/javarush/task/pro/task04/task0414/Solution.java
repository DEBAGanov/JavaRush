package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        if (number > 0 && number < 5) {
            int i = 0;
            do {
                System.out.println(string);
                i++;
            } while (i < number);
        } else
            System.out.println(string);
    }
}
