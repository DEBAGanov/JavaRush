package com.javarush.task.task01.task0133;

public class Solution {
    public static void main(String[] args) {
        int result = numberOfSeconds(30);
        System.out.println(result);
    }

    public static int numberOfSeconds(int time) {
        return time * 60;
    }
}
