package com.javarush.task.task07.task0714;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> words =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 слов: ");
        for (int i=0; i<=5;i++){
            words.add(scanner.nextLine());
        }

        words.remove(2);
        Collections.reverse(words);
        System.out.println("Оставшиеся элементы в обратном порядке");

        for (int i=0; i<=5;i++){
            System.out.println(words);
        }



    }
}
