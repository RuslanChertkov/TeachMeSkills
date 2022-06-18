package Lesson3;
import java.util.Random;
public class Hw3 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < arr.length; i++){
        }
        for (int element: arr) {
            System.out.print(element + " ");
        }
        int counter = 0;
        for(int i=10;i>0; i--)
        {
            if(arr[i]%2==0)
            {
                counter++;
            }
        }
        System.out.println("Чётные: "+ counter);
    }
}
