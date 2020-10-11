package com.epam.automation;

import java.util.Scanner;

public class TaskOne {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String name = in.nextLine();
        System.out.println("Здравствуйте " + name);
    }
}
