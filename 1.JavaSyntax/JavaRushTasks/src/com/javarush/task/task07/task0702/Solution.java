package com.javarush.task.task07.task0702;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String[] array = new String[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scanner.nextLine();
        }

        System.out.println("Элементы массива в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
