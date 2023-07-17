package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String soldier = ", явитесь в военкомат";
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введит имя:");
        String name = scanner.nextLine();
        System.out.println("Введит возраст:");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + soldier);
        }
    }
}
