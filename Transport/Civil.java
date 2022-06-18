package Transport;

import java.util.Scanner;


public class Civil extends Air {
    private int countPassengers;
    private boolean business;

    public Civil() {

    }

    public Civil(int capacity, int maxSpeed, int weigh, String brend, int wingspan, int minRunway, int countPassengers, boolean business) {
        super(capacity, maxSpeed, weigh, brend, wingspan, minRunway);
        this.countPassengers = countPassengers;
        this.business = business;
    }

    public void display() {
        System.out.printf("\nCivil: \nCapacity:%.2f kw, \nMaxSpeed:%d km/h, \nWeigh:%d kg, \nBrend:%s, \nWingspan:%d, \nMinRunway:%d, \nPassengers:%d, \nBusiness:%b;", this.countCapacity(), this.getMaxSpeed(), this.getWeigh(), this.getBrend(), this.getWingspan(), this.getMinRunway(), this.countPassengers, this.business);
    }

    public void passengers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предполагаемое количество пассажиров:");
        double passengers = sc.nextInt();
        if (countPassengers>passengers){
            System.out.println("Самолёт загружен!");
        }else{
            System.out.println("Вам нужен самолёт больше!");
        }

    }
}
