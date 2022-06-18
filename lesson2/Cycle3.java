package lesson2;

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum = num.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        int months = num.nextInt();
        for (int i = 1; i <= months; i++){
        sum += (sum * 0.07) * months;
    }
    System.out.println("После одного месяца сумма вклада составит: "+sum);

}}
