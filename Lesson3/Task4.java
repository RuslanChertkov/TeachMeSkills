package Lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[9];

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i] && arr[i]%2!=0) {
                min = arr[i];
            }
        }
        System.out.print("\nМинимальный нечётный элемент массива:" + min);

    }
}
