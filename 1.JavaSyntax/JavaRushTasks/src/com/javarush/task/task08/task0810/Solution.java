package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();

        fill(arrayList);
        fill(linkedList);

        System.out.println("Время получения элементов из ArrayList: " + getTimeMsOfGet(arrayList) + " mc");
        System.out.println("Время получения элементов из LinkedList: " + getTimeMsOfGet(linkedList) + " mc");

    }

    public static void fill(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i, new Object());
        }
    }

    public static void get10000(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static long getTimeMsOfGet(List<Object> list) {
        long timeStart = System.currentTimeMillis();
        get10000(list);
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }

}
