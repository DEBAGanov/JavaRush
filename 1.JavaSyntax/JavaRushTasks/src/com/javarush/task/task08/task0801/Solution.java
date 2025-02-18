package com.javarush.task.task08.task0801;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        HashSet<String> plants = new HashSet<>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");
        plants.add("картофель");
        plants.add("");

        for (String plant : plants) {
            System.out.println(plant);
        }
    }
}
