package com.javarush.task.task01.task0132;

public class Solution {
    public static void main(String[] args) {
        int result = sumDigitsInNumber(546);
        System.out.println(result);
    }

    public static int sumDigitsInNumber(int number) {
        int digit1 = number % 10; // Получаем первую цифру
        int digit2 = (number / 10) % 10; // Получаем вторую цифру
        int digit3 = number / 100; // Получаем третью цифру

        int sum = digit1 + digit2 + digit3; // Суммируем все цифры

        return sum;
    }
}
