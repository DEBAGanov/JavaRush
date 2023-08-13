package com.javarush.task.task03.task0303;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 2));
        System.out.println(convertEurToUsd(100,0.5));

    }

    public static double convertEurToUsd(double eur, double course) {
        return eur * course;
    }
}
