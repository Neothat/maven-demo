package com.epam.optional;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class TaskOneSeven {
    public static void main(String[] args) {
        System.out.println("Введите объем массива: ");
        Scanner in = new Scanner(System.in);
        int [] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elem %d: ", i);
            array[i] = in.nextInt();
        }

        System.out.println("\n" + Arrays.toString(array));
        foo(array);
    }

    public static void foo(int[] array) {
        for (int j : array){
            if (check(j)){
                System.out.println("Первое число, которое состоит только из различны цифр, это: " + j);
                break;
            }
        }
    }

    public static boolean check (int x){
        HashSet<Integer> nums = new HashSet<>();
        int originalSize = 0;
        while (x>0){
            nums.add(x % 10);
            originalSize++;
            x /= 10;
        }
        if (nums.size()==originalSize)
            return true;
        else return false;
    }
}
