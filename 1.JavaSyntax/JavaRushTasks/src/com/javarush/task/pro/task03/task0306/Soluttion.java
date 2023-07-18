package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Soluttion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("теругольник существует");
        } else {
            System.out.println("треугольник не существует");
        }

    }
}
