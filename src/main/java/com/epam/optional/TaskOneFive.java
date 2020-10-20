package com.epam.optional;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class TaskOneFive {
    public static int even, odd, quantity;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите объем массива");
        int [] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elem %d: ", i);
            array[i]= in.nextInt();
        }
        System.out.println("\n" + Arrays.toString(array));
        foo(array);
    }

    public static void foo(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (check(array[i])){
                quantity++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры: " + quantity);
    }

    public static boolean check (int x){

        if (x != 0){
            if (x % 2 ==0)
                even++;
            else odd++;
        }
    }
}
