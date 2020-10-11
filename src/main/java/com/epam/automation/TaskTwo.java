package com.epam.automation;

public class TaskTwo {
    public static void main(String[] args) {
        int EnteredNumber[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = EnteredNumber.length-1; i >= 0; i--){
            System.out.print(EnteredNumber[i] + " ");
        }
    }
}
