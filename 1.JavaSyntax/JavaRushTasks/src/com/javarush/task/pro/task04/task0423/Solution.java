package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum / 5);
    }
}