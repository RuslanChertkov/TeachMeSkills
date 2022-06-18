package lesson1;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первую сторону:");
        int a=num.nextInt();
        System.out.println("Введите вторую сторону:");
        int b=num.nextInt();
        System.out.println("Введите третью сторону:");
        int c=num.nextInt();
            if (a<b+c && b<a+c && c<a+b ) {
        System.out.println("Треугольник существует");
    }else{
        System.out.println("Треугольника не существует");
    }
    }
}
