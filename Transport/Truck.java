package Transport;
import java.util.Scanner;
public class Truck extends Land {
    private int carrying;

    public Truck(){

    }

    public Truck(int capacity, int maxSpeed, int weigh, String brend, int countWheels, int fuelConsumption, int carrying){
        super(capacity, maxSpeed, weigh, brend, countWheels, fuelConsumption);
        this.carrying=carrying;

    }
    public void display (){
        System.out.printf("\nTruck: \nCapacity:%.2f kW, \nMaxSpeed:%d km/h, \nWeigh:%d kg, \nBrend:%s, \nWheels:%d, \nFuel Consumption:%.2f, \nCarrying:%d;", this.countCapacity(), this.getMaxSpeed(), this.getWeigh(), this.getBrend(), this.getCountWheels(), this.getFuelConsumption(), this.carrying);
    }
    public void cargo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес грза:");
        double cargo = sc.nextDouble();
        if(carrying>cargo){
            System.out.println("Грузовик загружен!");
        }else{
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

}
