
package com.javarush.task.task07.task0704;

import java.util.Scanner;

public abstract class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[10];
        System.out.println("Введите 10 чисел: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Список в обратном порядке: ");
        for (int i = arr.length - 1; i <= arr.length; i--) {
            System.out.println(arr[i]);
        }
    }
}
