package optional2;

import java.util.Random;
import java.util.Scanner;

public class TaskTwoThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерность матрицы");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -10 + random.nextInt(21); // -10; 10
            }
        }
        printMatrix(array);

        int firstPositiveElement = -1;
        int secondPositiveElement = -1;
        int sum;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0){
                    firstPositiveElement = j;
                    break;
                }
            }
            for (int j = firstPositiveElement+1; j < array[i].length; j++) {
                if (array[i][j] > 0){
                    secondPositiveElement = j;
                    break;
                }
            }
            sum = 0;
            for (int k = firstPositiveElement + 1; k < secondPositiveElement; k++) {
                sum += array[i][k];
            }
            System.out.printf("На %d строке сумма элементов матриц, " +
                    "расположенных между первым и вторым положительными элементами %d \n", i, sum);
        }
    }

    public static void printMatrix(int[][] array) {
        for (int[] i : array) {
            for (int k : i) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
