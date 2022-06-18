package Lesson3;

public class Hw1 {
    public static void main(String[] args) {
   int [] arr = new int[10];
   for (int i = 0; i < arr.length; i++){
       arr[i] = i*2 +2;
   }
     for (int element: arr){
         System.out.print(element + " ");
     }
        System.out.println();
     for (int element: arr){
         System.out.print("\n");
         System.out.print(element);
     }
    }
}
