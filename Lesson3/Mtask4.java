package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Mtask4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = r.nextInt(51);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int summ = 0;
        for (int i=0;i< arr.length; i++){
            for (int j = arr.length-2-i; j>=0; j--){
                if(arr[i][j]%2==0){
                    summ+=arr[i][j];
                    break;
                }

            }
        }
        System.out.print("\nСумма=" + summ);
    }
}