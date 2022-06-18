package Lesson3;
import java.util.Random;
public class Hw4 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i<arr.length; i++){
            arr[i] = r.nextInt(21);
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("-----------");
        for (int i=0; i < arr.length; i++){

            if (i%2!=0) {
                arr[i] = 0;
            }
        }
        for (int element:arr){
            System.out.print(element + " ");
        }
        }
    }

