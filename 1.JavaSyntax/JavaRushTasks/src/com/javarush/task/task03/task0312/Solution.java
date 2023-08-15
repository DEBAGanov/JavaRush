package com.javarush.task.task03.task0312;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(1));
    }

    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }
}
