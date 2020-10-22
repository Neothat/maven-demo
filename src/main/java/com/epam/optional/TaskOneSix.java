package com.epam.optional;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOneSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введиет размерность массива");
        int[] array = new int[in.nextInt()];

        for (int i : array){
            System.out.printf("Elem %d ", i);
            array[i] = in.nextInt();
        }

        System.out.println("\n" + Arrays.toString(array));
        foo(array);
    }

    public static void foo(int [] array) {
        for(int i : array){
            if (check(array[i])){
                System.out.println("Первое число, в котором цифры идут в срогом порядке: " + array[i]);
                break;
            }
        }
    }

    public static boolean check(int x){
        int max = x % 10;
        x /= 10;
        while (x>0 & (x % 10)<max){
            x /= 10;

        }
    }
}
