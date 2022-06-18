package lesson1;
import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        int[] num = {1, -5, 8};
        int Negative = 0;
        int Positive = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 0) {
                Negative++;
            } else if(num[i] > 0) {
                Positive++;
            }
        }
        System.out.printf("Положительных: %d%nОтрицательных: %d%n%n", Positive, Negative);
    }
}
