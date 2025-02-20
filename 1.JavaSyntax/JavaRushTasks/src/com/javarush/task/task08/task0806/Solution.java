package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("sim", 1);
        map.put("tom", 2);
        map.put("cat", true);
        map.put("viki", 4);
        map.put("tim", "hello");
        map.put("zoya", 6);
        map.put("ivan", 3.14);
        map.put("dima", 8);
        map.put("olga", 'A');
        map.put("alex", 10);

        for (String s : map.keySet()) {
            System.out.println(s + " - " + map.get(s));
        }

    }

}
