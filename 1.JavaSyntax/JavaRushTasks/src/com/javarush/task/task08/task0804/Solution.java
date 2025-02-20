package com.javarush.task.task08.task0804;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Том", "Том");
        map.put("Арнольд", "Арнольд");
        map.put("Джон", "Джон");
        map.put("Майк", "Майк");
        map.put("Барсик", "Sim");
        map.put("Томас", "Том");
        map.put("Арчи", "Арнольд");
        map.put("Джонотан", "Джон");
        map.put("Майкл", "Майк");
        map.put("Sima", "Sim");

        printKeys(map);

    }

    public static void printKeys(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
