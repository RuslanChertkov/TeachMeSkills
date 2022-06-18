package Lesson3;
import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random r = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i <arr.length; i ++){
            arr[i] = r.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nНовый массив:");
        for (int i=0; i<arr.length; i++){
            if ((i+1)%2!=0){
                arr[i]=0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
