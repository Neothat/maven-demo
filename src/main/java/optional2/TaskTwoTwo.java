package optional2;

import java.util.Random;
import java.util.Scanner;

public class TaskTwoTwo {
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

        System.out.println("Наибольшее число возрастающих в столбец элементов матрицы, идущих подряд:");
        int max = 0;

        for (int j = 0; j < array[0].length; j++) {
            int checkMax = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][j] < array[i + 1][j]) {
                    checkMax++;
                    if (checkMax > max)
                        max = checkMax;
                } else {
                    checkMax = 0;
                }
            }
        }
        System.out.println("Наибольшее число элементов: " + (max + 1));

        System.out.println("Наибольшее число возрастающих в строку элементов матрицы, идущих подряд:");
        max = 0;

        for (int i = 0; i < array.length; i++) {
            int checkMax = 0;
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] < array[i][j+1]) {
                    checkMax++;
                    if (checkMax > max)
                        max = checkMax;
                } else {
                    checkMax = 0;
                }
            }
        }
        System.out.println("Наибольшее число элементов: " + (max + 1));
    }
    public static void printMatrix(int[][] array){
        for (int[] i : array) {
            for (int k : i) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
