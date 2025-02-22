package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        insert10000(arrayList);
        insert10000(linkedList);
        get10000(arrayList);
        get10000(linkedList);
        set10000(linkedList);
        set10000(arrayList);
        remove10000(arrayList);
        remove10000(linkedList);

        measureTime("Insert ArrayList", () -> insert10000(arrayList));
        measureTime("Insert LinkedList", () -> insert10000(linkedList));
        measureTime("Get ArrayList", () -> get10000(arrayList));
        measureTime("Get LinkedList", () -> get10000(linkedList));
        measureTime("Set ArrayList", () -> set10000(arrayList));
        measureTime("Set LinkedList", () -> set10000(linkedList));
        measureTime("Remove ArrayList", () -> remove10000(arrayList));
        measureTime("Remove LinkedList", () -> remove10000(linkedList));
        measureTime("Contains Element ArrayList", () -> containsElement(arrayList));
        measureTime("Contains Element LinkedList", () -> containsElement(linkedList));

    }

    public static void measureTime(String operation, Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(operation + " took " + duration + " nanoseс.");
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < 1000; i++) {
            list.set(i, i);
        }
    }

    public static void remove10000(List list) {
        for (int i = 9999; i >= 0; i--) {
            list.remove(i);
        }
    }

    public static void containsElement(List list) {
        boolean contains = list.contains("5555");
    }
}