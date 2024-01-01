
package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> string = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            string.add(reader.readLine());
        }
        System.out.println("=======");
        for (int i = 0; i < 13; i++) {
            String lastString = string.remove(string.size() - 1);
            System.out.println(lastString);
            string.add(0, lastString);

        }
        System.out.println("=======");
        for (String strings : string) {
            System.out.println(strings);
        }
    }
}
