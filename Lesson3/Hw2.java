package Lesson3;

import javax.swing.*;
import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i * 2) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("-----------\n");
        for ( int i = arr.length -1; i >=0;  i--){
            System.out.print(arr[i] + " ");
        }
    }
}








//
//        int[] arr = new int[50];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1 + 2 * i;
//        }
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (int i = arr.length - 1; i >= 0; i--) {
//
//                System.out.print(i + " ");
//            }


