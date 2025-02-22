package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Время вставки в ArrayList: " + getTimeMsOfInsert(new ArrayList<>()));
        System.out.println("Время вставки LinkedList: " + getTimeMsOfInsert(new LinkedList<>()));

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i, new Object());
            // System.out.println(i);
        }
    }

    public static long getTimeMsOfInsert(List list) {
        long timeStart = System.currentTimeMillis();
        insert10000(list);
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
