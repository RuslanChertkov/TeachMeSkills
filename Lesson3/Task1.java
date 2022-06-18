package Lesson3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int com =1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.print("Массив: ");
        for (int element:arr){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%3==0 && arr[i]!=0){
                com*=arr[i];
            }
            else{
                continue;
            }
        }
        System.out.print("Произведение элементов: " + com);
    }
}
