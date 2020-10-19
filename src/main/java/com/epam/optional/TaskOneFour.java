package com.epam.optional;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class TaskOneFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите объем массива:");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elem %d: ", i);
            array[i] = in.nextInt();
        }
        System.out.println("\n" + Arrays.toString(array));
        foo(array);
    }

    public static void foo(int[] array) {
        int min = diffNum(array[0]);
        int minElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (diffNum(array[i]) < min) {
                min = diffNum(array[i]);
                minElement = array[i];
            }
        }
        System.out.printf("Elem: %d", minElement);
    }

    public static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while (x > 0) {
            nums.add(x % 10);
            x /= 10;
            /*System.out.println(nums);
            System.out.println(x);*/
        }
        return nums.size();
    }
}
