package com.javarush.task.task07.task0705;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения для массива из 20 чисел:");

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < smallArray1.length; i++) {
            smallArray1[i] = bigArray[i];
        }

        for (int i = 0; i < smallArray2.length; i++) {
            smallArray2[i] = bigArray[i + 10];
        }

        System.out.println("Второй маленький массив:");

        for (int number : smallArray2) {
            System.out.println(number);
        }
    }
}