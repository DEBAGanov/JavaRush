package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();

        if (numb1 == numb2 && numb2 == numb3) {
            System.out.println(numb1 + " " + numb2 + " " + numb3);
        } else if (numb1 == numb2) {
            System.out.println(numb1 + " " + numb2);
        } else if (numb2 == numb3) {
            System.out.println(numb2 + " " + numb3);
        } else if (numb1 == numb3) {
            System.out.println(numb1 + " " + numb3);
        } else {
            System.out.println("Пар не найдено");
        }
    }
}
