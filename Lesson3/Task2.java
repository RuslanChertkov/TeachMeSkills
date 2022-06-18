package Lesson3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.print("Массив 1: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Массив 2: ");
        for (int i = 1; i < arr.length; i+=2) {
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        double average = 0;
        for(int i=0; i<arr.length; i+=2){
            average+=(double) arr[i]/arr.length;
        }
        System.out.print("Среднее арифмитическое=" + average);

    }
}