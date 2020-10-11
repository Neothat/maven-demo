package com.epam.automation;

import java.util.Scanner;
import java.lang.Math;

public class TaskThree {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введиет число случайных чисел:");
        int quantity = in.nextInt();
        int []array = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        for (int i = 0; i < quantity; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
