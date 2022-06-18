package Lesson3;

import java.util.Random;

public class Hw8 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr1[i] = r.nextInt(10);
            arr2[i] = r.nextInt(10) ;
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        System.out.print("Первый массив: ");
        for (int element:arr1){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Второй массив: ");
        for (int element:arr2){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Третий массив: ");
        for (double element:arr3){
            System.out.print(element + " ");
        }

        System.out.println();
        int counter = 0;
        for (int i = 0; i < arr3.length; i++)
            if (arr3[i] % 1 == 0){
                counter++;
            }
        System.out.println("Количество целых элементов в третьем массиве: " + counter);
    }
}