package com.epam.automation;

import java.util.Scanner;

public class TaskFour {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для будующего ввода");
        int size = in.nextInt();
        int []array = new int [size];
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            sum += array[i];
            mul *= array[i];
        }
        System.out.println("Сумма введеных чисел: " + sum + ". Произведение чисел: " + mul + ".");
    }
}
