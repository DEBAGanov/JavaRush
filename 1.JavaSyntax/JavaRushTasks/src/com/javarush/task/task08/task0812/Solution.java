package com.javarush.task.task08.task0812;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        System.out.println("Максимальная последовательность: " + getLengthOfMaxSequence(list));
    }

    public static int getLengthOfMaxSequence(ArrayList<Integer> list) {
        int max = 0;
        int count = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}
