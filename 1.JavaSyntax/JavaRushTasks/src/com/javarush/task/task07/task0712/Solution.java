
package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main (String [] args) throws IOException{
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++){
            strings.add(reader.readLine());
        }

        int min = list.get(0).length();
        for(int i=0; i<10; i++){
            if (min>list.get(i).length ) {
                min = list.get(i);
            }
        }
        String shortestString = strings.get(0);
        String longestString = strings.get(0);

        for (String str : strings) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
                System.out.println("Строка, которая встретится раньше: " + shortestString);
            }
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }


    }
}
