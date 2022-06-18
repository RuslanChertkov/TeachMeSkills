package lesson1;
import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = num.nextInt();
        System.out.println("Введите второе число:");
        int b = num.nextInt();
        System.out.println("Большее из двух чисел:");
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
    }}}
