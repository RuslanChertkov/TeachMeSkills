package Car;

import java.util.Random;

public class Car {
    private String brend;
    private double cost;
    private double speed;

    public Car() {
    }

    public Car(String brend, double cost, double speed) {
        this.brend = brend;
        this.cost = cost;
        this.speed = speed;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void start() {
        Random r = new Random();
        int number = r.nextInt(21);
        System.out.println("Число равно " + number);
        try {
            if (number % 2 == 0) {
                throw new Exception("Машина не завелась, так как выпало чётное число");
            } else {
                System.out.println("Машина завелась!");
            }
        } catch (Exception e) {
            System.out.println("Результат " + e);
        }
    }
}



