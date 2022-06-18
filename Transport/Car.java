package Transport;

import java.util.Scanner;


public class Car extends Land {
    private String bodyType;
    private int numberOfPassengers;

    public Car() {
    }

    public Car(int capacity, int maxSpeed, int weigh, String brend, int countWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(capacity, maxSpeed, weigh, brend, countWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    

    }

    public void display() {
        System.out.printf("\nCar: \nCapacity:%.2f kW, \nMaxSpeed:%d km/h, \nWeigh:%d kg, \nBrend:%s, \nWheels:%d, \nFuel Consumption:%.2f, \nBody Type:%s, \nNumber of passengers:%d;", this.countCapacity(), this.getMaxSpeed(), this.getWeigh(), this.getBrend(), this.getCountWheels(), this.getFuelConsumption(), this.bodyType, this.numberOfPassengers);
    }


    
    public void distance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время пути:");
        double time = sc.nextDouble();
        double distance = time * getMaxSpeed();
     double fuelCon;
    System.out.printf("За время %.2f ч., автомобиль %s, двигаясь с максимальной скоростью %d км/ч проедет %.2f км и израсходует %.2f л топлива", time, this.getBrend(), this.getMaxSpeed(),distance, fuelCon(distance));
    }
    private double fuelCon(double distance) {
        double fuelCon = distance * (this.getFuelConsumption() * 0.01);
        return fuelCon;
    }
    
}

