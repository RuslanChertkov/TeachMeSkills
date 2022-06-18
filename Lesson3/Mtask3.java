package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Mtask3 {
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
        int proizvedenie1 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    proizvedenie1 *= arr[i][j];
                    break;
                }
            }
        }
        System.out.print("Произведение главной диагонали=" + proizvedenie1);
        int proizvedenie2 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1 - i; j >= 0; j--) {
                proizvedenie2 *= arr[i][j];
                break;
            }
        }
        System.out.println("\nПроизведение побочной диагонали=" + proizvedenie2);
        if (proizvedenie1 > proizvedenie2) {
            System.out.print("\nПроизведение главной диагонали больше побочной!");
        }else if (proizvedenie1 < proizvedenie2) {
            System.out.print("\nПроизведение побочной диагонали больше главной!");
        }else if (proizvedenie1 == proizvedenie2) {
                    System.out.print("\nПроизведения диагоналей равны!");
                }
            }
        }

