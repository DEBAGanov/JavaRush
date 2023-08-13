package com.javarush.task.pro.task05.task0527;

import java.util.Arrays;

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        for (int i = 1; i < array.length; i++) {
            array[i] = new int[2 * i + 1];
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
