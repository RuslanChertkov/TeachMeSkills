package Lesson3;

import java.util.Random;

public class Hw6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(11);
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("--------");
        boolean flag = true;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i-1]) {
                flag = false;
                break;
            }
        if(flag){
                System.out.println("Строго возрастающий массив");
            } else {
                System.out.println("Невозрастающий!");
            }
        }
    }
