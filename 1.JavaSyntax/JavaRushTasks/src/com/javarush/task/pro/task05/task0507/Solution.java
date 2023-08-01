package com.javarush.task.pro.task05.task0507;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }


        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("максимальное число: " + array[array.length -1]);



        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println("максимальное число: " + max);
    }
}
