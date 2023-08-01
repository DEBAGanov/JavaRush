package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("отсортированный массив чисел: " +Arrays.toString(array));
        System.out.println("минимальное число: "+array[0]);
    }
}
