package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
            System.out.print(arr[i] + " ");
        }
//         for (int i = arr.length + 1; i < 0; i++) { //сортировка пузырьком
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int value = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = value;
//                }
//            }
//        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
        }
        for (int i =0; i<arr.length; i++){
            if(arr[i]==arr[i+1]) {
                System.out.println("\nЕсть совпадающие числа!");
                break;
            }else {
                System.out.println("\nВсе числа разные!");
                break;
            }
        }
    }

}
