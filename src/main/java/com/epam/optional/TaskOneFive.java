package com.epam.optional;

import java.util.Scanner;
import java.util.Arrays;

public class TaskOneFive {
    public static int even, odd, quantity, quantityTwo;
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

            if (checkTwo(array[i])){
                quantityTwo++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры: " + quantity + "\n" +
                "Количество чисел, содержащие равное колличество четных и не четных цифр: " + quantityTwo);
    }

    public static boolean check (int x){
        int a = 0;
        boolean b = false;
        while (x != 0){
            a++;
            if ((x % 10) % 2 == 0)
                even++;
            else odd++;
            x /= 10;
        }
        if(a == even)
            b = true;

        even = odd = 0;
        return b;
    }

    public static boolean checkTwo (int x){
        boolean b = false;
        while (x != 0){
            if ((x % 10) % 2 == 0)
                even++;
            else odd++;
            x /= 10;
        }
        if(even == odd)
            b = true;

        even = odd = 0;
        return b;
    }
}
