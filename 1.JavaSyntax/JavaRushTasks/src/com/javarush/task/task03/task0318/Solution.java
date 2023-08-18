package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String n = reader.readLine();
        System.out.println(name + " захватит мир через " + n + " лет. Му-ха-ха!");

    }
}