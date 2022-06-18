package lesson1;
import java.util.Scanner;

public class JavaHw1 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        System.out.println("Введите число:");
        String num = str.nextLine();
        int len1 = num.length();
        System.out.println("Ответ:");
        if (len1 == 1){
            System.out.println( " Число однозначное " ) ;
        }
        else if (len1 == 2){
            System.out.println( "Число двухзначное " );
        }
        else if (len1 == 3) {
            System.out.println("Число трёхзначное ");
        }
        else {
            System.out.println(" Ошибка! ");
        }
     }
}
