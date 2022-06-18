package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Hw10 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = sc.nextInt();
        if (n > 3) {
            int[] arr1 = new int[n];
            int [] arr2 = new int[n];
            for (int i=0; i<arr1.length; i++){
                arr1[i]=r.nextInt(n);
            } System.out.print("Первый массив:");
            for (int element:arr1){

                System.out.print(element + " ");
            }
            for (int i=0; i<arr2.length; i++){
                if(arr1[i]%2==0){
                    arr2[i]=arr1[i];
                }
            }
            System.out.println();
            System.out.print("Второй массив: ");
            for (int element:arr2){
                System.out.print(element+ " ");
            }

        }else {
            System.out.println("Вы ввели неподходящее число! Введите число больше 3!");
        }
    }
}
