package com.epam.optional;

import java.util.Scanner;

class TaskOneTwo{
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число или множество чисел через пробел");
        String line = in.nextLine();
        String []array = new String[6];
        int a = 0;
        for (String s : line.split(" ")) {
            array[a] = s;
            a++;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i].length() < array[i - 1].length()) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }

            }
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}