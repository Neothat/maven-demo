package com.epam.automation;

import java.util.Scanner;

public class TaskFive {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String nameMouth;
        System.out.println("Введите число от 1 до 12 и узнайте какой месяц соответсвуют этому числу");
        int mouth = in.nextInt();
        switch (mouth){
            case 1: nameMouth = "January";
            break;

            case 2: nameMouth = "February";
            break;

            case 3: nameMouth = "March";
            break;

            case 4: nameMouth = "April";
            break;

            case 5: nameMouth = "May";
            break;

            case 6: nameMouth = "June";
            break;

            case 7: nameMouth = "July";
            break;

            case 8: nameMouth = "August";
            break;

            case 9: nameMouth = "September";
            break;

            case 10: nameMouth = "October";
            break;

            case 11: nameMouth = "November";
            break;

            case 12: nameMouth = "December";
            break;
            default:
                throw new IllegalStateException("Недопустимое значение: " + mouth);
        }
        System.out.println("Числу " + mouth + " Соотвутсвует месяц " + nameMouth);
    }
}
