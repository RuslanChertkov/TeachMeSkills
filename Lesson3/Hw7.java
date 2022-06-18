package Lesson3;

import java.util.Random;

public class Hw7 {
    public static void main(String[] args) {
        int arr[] = new int[12];
        Random r = new Random();
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(16);
            System.out.print  (arr[i] + " ");
            if(max<arr[i]){
                max=arr[i];
                index =i;
            }
        }System.out.println();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Индекс: " + index);
}
    }


