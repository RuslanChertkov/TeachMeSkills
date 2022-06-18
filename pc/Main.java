package pc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PC comp = new PC("Intel Core I7", 16, "Western Digital", 3);
        comp.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во циклов:");
        int counter = scanner.nextInt();

        while (counter>0){
            comp.switchOn();
            counter--;

        }
    }
}
