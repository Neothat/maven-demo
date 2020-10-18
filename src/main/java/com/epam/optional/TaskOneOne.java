package com.epam.optional;

import java.util.Scanner;

public class TaskOneOne {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число или множество чисел через пробел");
        String line = in.nextLine();
        String LongWord = "", ShortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > LongWord.length()) LongWord = s;
            if (s.length() < ShortWord.length()) ShortWord = s;
        }
        System.out.println("Самое длинное число: " + LongWord + " Его длина: " + LongWord.length());
        System.out.println("Самое короткое слово: " + ShortWord + " Его длина : " + ShortWord.length());
    }
}
