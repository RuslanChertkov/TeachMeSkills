package lesson1;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число:");
        int a=num.nextInt();
        System.out.println("Ваш результат:");
        if(a>0){
            System.out.println(a+1);
        }
        else if(a<0){
            System.out.println(a-2);
        }
        else if(a==0){
            System.out.println(a=10);
        }
    }
}
