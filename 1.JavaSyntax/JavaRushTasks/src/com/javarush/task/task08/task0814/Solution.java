package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Integer> set = createSet();
        removeAllNumbersMoreThan10(set);
        System.out.println(createSet());
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }

    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > 10) {
                iterator.remove();
            }
        }
        return set;
    }
}
