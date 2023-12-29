package com.javarush.task.task07.task0703;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String arrStr[] = new String[4];
        int arrInt[] = new int[4];
        System.out.println("Введите 10 строк: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = scanner.nextLine();
            arrInt[i] = arrStr[i].length();
        }

        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("Размер строки: " + arrInt[i] + "   " + arrStr[i]);
        }
    }
}
