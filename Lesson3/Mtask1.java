package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Mtask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер квадратного массива:");
        int n;
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = r.nextInt(51);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j && arr[i][j] % 2 == 0) {
                    summ += arr[i][j];

                }
            }
        }
        System.out.print("Сумма =" + summ);
    }
}