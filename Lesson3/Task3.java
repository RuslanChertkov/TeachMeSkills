package Lesson3;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[5];
        int c=5;
        double average = 0;
        System.out.print("Массив: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = r.nextInt(16);
            System.out.print(arr[i] + " ");
          average += (double) arr[i]/arr.length;
          }
        System.out.print("\nСреднее арифмитическое равно: " + average );
        if(average>c) {
            System.out.println("\nСреднее арифмитическое больше некоторого числа!");
        } else{
            System.out.println("\nСреднее арфифмитическое не превосходит некоторое число!");
        }
        }
    }

