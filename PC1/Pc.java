package PC1;

import java.util.Scanner;
import java.util.Random;

public class Pc {
    private String cpu;
    private int ram;
    private int hdd;
    private int fullCycle;

    public Pc() {
    }

    public Pc(String cpu, int ram, int hdd, int fullCycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.fullCycle = fullCycle;

    }

    public void displayInfo() {
        System.out.printf("\nComputer is: \nCPU: %s, \nRAM: %d, \nHDD: %d, \nFullCycle: %d;", this.cpu, this.ram, this.hdd, this.fullCycle);
    }

    public void swithOn() {
        if (this.fullCycle > 0) {
            Random r = new Random();
            int i = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("\n  Введите число 0 либо 1 для успешного запуска!");
            int q = sc.nextInt();
            if (q == i) {
                this.fullCycle--;
                this.swithOff();
            } else {
                this.fullCycle = 0;
                System.out.println("Компьютер сгорел!");
            }
        }else{
            System.out.println("Ресурсы компьютера закончились!");
        }
    }
    public void swithOff() {
        if (this.fullCycle > 0) {
            Random r = new Random();
            int i = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число 0 либо 1 для успешного запуска!");
            int q = sc.nextInt();
            if (q == i) {
                this.fullCycle--;
                System.out.println("Компьютер выключился!");
            } else {
                this.fullCycle = 0;
                System.out.println("Компьютер сгорел!");
            }
        } else {
            System.out.println("Ресурсы компьютера закончились!");
        }
    }
}
