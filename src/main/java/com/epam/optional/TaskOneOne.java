package com.epam.optional;

import java.util.Scanner

public class TaskOneOne {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        String quantity = in.nextLine();
        String []array = new String[][quantity];
        for (int i = 0; i < array.length; i++) {
            array[i]= in.nextLine();
        }
        String longWord = "", shortWord = quantity;
    }
}
