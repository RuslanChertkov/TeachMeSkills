package pc;

import java.util.Random;
import java.util.Scanner;

public class PC {
    private String cpu;
    private int ram;
    private String ssd;
    private int workCycle;

    public PC() {
    }

    public PC(String cpu, int ram, String ssd, int workCycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.workCycle = workCycle;
    }

    public int getRam() { //возвращаю числовое значение(int)
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void display() {
        System.out.printf("Характеристики компьютера: \ncpu %s, \nram %d, \nssd %s, \nworkCycle %d;", this.cpu, this.ram, this.ssd, this.workCycle);
    }

    public void switchOn() {
        if (this.workCycle > 0) {
            Random r = new Random();
            int i = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число для успешного включения компьютера(0 либо 1): ");
            int a = sc.nextInt();
            if (a == i) {
                this.workCycle--;
                this.switchOff();
            } else {
                this.workCycle = 0;
                System.out.println("Компьютер сгорел!");
            }


        } else {
            System.out.println("Ресурсы компьютера закончились!");
        }
    }

    public void switchOff() {
        if (this.workCycle > 0) {
            Random r = new Random();
            int i = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число для успешного выключения компьютера(0 либо 1): ");
            int a = sc.nextInt();
            if (a == i) {
                this.workCycle--;
                System.out.println("Компьютер выключился!");

            } else {
                this.workCycle = 0;
                System.out.println("Компьютер сгорел!");
            }
        } else {
            System.out.println("Ресурсы компьютера закончились!");
        }
    }
}