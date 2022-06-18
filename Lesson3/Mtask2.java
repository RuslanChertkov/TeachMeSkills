package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Mtask2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = r.nextInt(51);
            }
        }
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j && arr[i][j] % 2 != 0) {
                    System.out.print(arr[i][j]+ " ");
                }else if (i == j+1 && arr[i][j] % 2 != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
    }
