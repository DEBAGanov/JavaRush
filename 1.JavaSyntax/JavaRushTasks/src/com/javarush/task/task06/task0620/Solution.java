package com.javarush.task.task06.task0620;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int max = Math.max(num1, num2);
        int max2 = num1 > num2 ? num1 : num2;
        System.out.println("Max is " + max);
        System.out.println("Max is " + max2);
    }
}
