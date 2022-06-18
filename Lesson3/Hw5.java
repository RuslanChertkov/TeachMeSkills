package Lesson3;

import java.util.Random;

public class Hw5 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(16);
        }
        for (int element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("--------");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(16);
        }
        for (int element : arr2) {
            System.out.print(element + " ");
        }
        double average1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            average1 += (double) arr1[i] / arr1.length;
        }
        System.out.println();
        System.out.println("Среднее арифмитическое число для 1ого массива: " + average1);
        double average2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            average2 += (double) arr2[i] / arr2.length;
        }
        System.out.println("Среднее арифмитическое число для 2ого массива: " + average2);
        if (average1 > average2) {
            System.out.println("Среднее арифмитическое 1ого массива больше 2ого");
        }else if(average1<average2) {
            System.out.println("Среднее арифмитическое 2ого массив больше 1ого");
            }else{
            System.out.println("Средние арифмитические равны");
        }
        }

    }
