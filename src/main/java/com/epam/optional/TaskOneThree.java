package com.epam.optional;

import java.util.Scanner;
import java.lang.Math;

public class TaskOneThree {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число или множество чисел через пробел");
        String line = in.nextLine();
        String []array = new String[6];
        int a = 0;
        int sum = 0;
        for (String s : line.split(" ")) {
            array[a] = s;
            a++;
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].length();
        }
        double average = sum/array.length;
        int finalAverage = (int) Math.round(average);
        System.out.println("Числа больше среднего значения длины: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= finalAverage) {
                System.out.println(array[i]);
            }
        }
        System.out.println("Числа меньше среднего значения длины: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < finalAverage) {
                System.out.println(array[i]);
            }
        }
    }
}
