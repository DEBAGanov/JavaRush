package com.javarush.task.pro.task05.task0502;

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {

        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0)
                strings[i] = EVEN;
            else {
                strings[i] = ODD;
            }
        }
        System.out.println("strings[0]= " + strings[0]);
        System.out.println("strings[1]= " + strings[1]);
        System.out.println("strings[2]= " + strings[2]);
        System.out.println("strings[3]= " + strings[3]);
        System.out.println("strings[4]= " + strings[4]);
    }
}
