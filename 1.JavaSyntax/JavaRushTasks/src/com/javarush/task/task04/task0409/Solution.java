package com.javarush.task.task04.task0409;

public class Solution {
    public static void main(String[] args) {
        displayClosesToTen(8, 11);
        displayClosesToTen(7, 14);
    }

    public static void displayClosesToTen(int a, int b) {
        if (abc(a - 10) > abc(b - 10))
            System.out.println(b);
        else if (abc(a - 10) < abc(b - 10))
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int abc(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
