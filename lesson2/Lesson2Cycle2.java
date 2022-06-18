package lesson2;
import java.util.Scanner;

public class Lesson2Cycle2 {
    public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите количество часов: ");
            int time = num.nextInt();
            int amyoba = 1;
            for (int i = 0; i < time / 3; i++) {
                amyoba *= 2;
            }
            System.out.printf("За %d часов получится %d амеб.", time, amyoba);
        }
    }




