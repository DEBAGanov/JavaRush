package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("строки равны");
        } else {
            System.out.println("строки не равны");
        }
    }
}
