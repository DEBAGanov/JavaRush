package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num > 0) {
            multiArray = new int[num][];
            for (int i = 0; i < num; i++) {
                int n = Integer.parseInt(scanner.nextLine());
                multiArray[i] = new int[n];
            }
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
