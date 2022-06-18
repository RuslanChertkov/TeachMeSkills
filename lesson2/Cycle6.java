package lesson2;
import java.util.Scanner;

public class Cycle6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i;
        do {
            System.out.println("Введите первое число: ");
            int a = num.nextInt();
            System.out.println("Введите второе число: ");
            int b = num.nextInt();
            System.out.println("Результат умножения: "+a*b);
            System.out.println("Для выхода из программы: 1" );
            System.out.println("Для продолжения: любое другое число");
            i = num.nextInt();
        }
        while (i!=1);
        num.close();
    }
}
