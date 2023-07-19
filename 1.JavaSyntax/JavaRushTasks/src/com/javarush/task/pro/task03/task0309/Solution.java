package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int res = number1 >= number2 ? number1 : number2;
        System.out.println(res);
    }
}
