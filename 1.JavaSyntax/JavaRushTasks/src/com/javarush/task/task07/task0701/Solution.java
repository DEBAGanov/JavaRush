package com.javarush.task.task07.task0701;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println("Максимальное число: " + maxNumber);
    }

    public static int[] initializeArray() {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;

    }


}
