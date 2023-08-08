package com.javarush.task.pro.task05.task0518;

import java.util.Arrays;

public class Solution {
    public static int[] numbers = new int[] { 4, 5, 2, 34, 6, 7, 8, 6, 9 };

    public static void main(String[] args) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
