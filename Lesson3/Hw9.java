package Lesson3;

import java.util.Scanner;
import java.util.Random;

public class Hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        int[] arr = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {

                arr[i] = r.nextInt(16);
            }
            System.out.println();
            System.out.print("Массив: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
            for (int i = 0; i < arr.length / 2; i++) {
                sum1 += arr[i];
            }
            System.out.println();
            System.out.print("Сумма первой половины: " + sum1);
            for (int i = n / 2; i < arr.length; i++) {
                sum2 += arr[i];
            }
            System.out.println();
            System.out.print("Сумма второй половины: " + sum2 + "\n");
            if (sum1 > sum2) {
                System.out.println("Сумма первой половины больше второй!");
            } else if (sum1 < sum2) {
                System.out.println("Сумма второй половины больше первой!");
            } else {
                System.out.println("Суммы обеих половин равны!\n");
            }


        } else {
            System.out.println("Вы ввели неверный размер массива!");
        }
    }


}
