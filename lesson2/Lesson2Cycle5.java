package lesson2;

import java.util.Scanner;

public class Lesson2Cycle5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Введите количество дюймов: ");
        int a = num.nextInt();
        float res = 0;
        for (int i = 1; i <=a; i++) {
            res = (float) (i*2.54);
        }
        System.out.println("Перевод в сантиметры: " + res + "см");
    }
}
