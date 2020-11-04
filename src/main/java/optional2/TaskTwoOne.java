package optional2;

import java.util.Random;
import java.util.Scanner;

public class TaskTwoOne {
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

        /*System.out.println("Отсортированная по столбцам матрица:");

        for (int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;
            while (!isSorted){
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i+1][j]){
                        isSorted = false;

                        temp = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = temp;
                    }
                }
            }
        }
        printMatrix(array);
        }*/

        System.out.println("Отсортированная по строкам матрица: ");
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        isSorted = false;

                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        printMatrix(array);

        in.close();
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