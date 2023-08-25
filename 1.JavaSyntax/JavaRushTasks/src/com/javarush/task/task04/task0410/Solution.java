package com.javarush.task.task04.task0410;

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        if ((a > 50) && (a < 100))
            System.out.println("Число a содержится в интервале от 50 до 100");
        else
            System.out.println("Число a не содержится в интервале от 50 до 100");
    }
}
