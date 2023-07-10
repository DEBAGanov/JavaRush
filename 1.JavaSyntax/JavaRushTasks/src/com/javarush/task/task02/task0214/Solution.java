package com.javarush.task.task02.task0214;

public class Solution {
    public static void main(String[] args) {
        System.out.println(min(4, 7));
        System.out.println(min(-11, 8));
        System.out.println(min(-3, -2));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

}
