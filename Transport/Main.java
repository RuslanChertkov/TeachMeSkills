package Transport;

public class Main {
    public static void main(String[] args) {
        Military militaryAirplane = new Military(68000, 980, 39000, "Airplane M22", 45, 500, true, 40);
        militaryAirplane.display();

        System.out.print("\n-------------------------");

        Civil civilAirplane = new Civil(40000, 600, 20000, "Airplane C12", 55, 1200, 5000, true);
        civilAirplane.display();

        System.out.print("\n-------------------------");

        Truck truck = new Truck(650, 250, 10000, "Mercedes", 8, 18, 20000);
        truck.display();

        System.out.print("\n-------------------------");

        Car car = new Car(1100, 150, 2000, "Porche", 4, 16, "Sedan", 4);
        car.display();
        System.out.println();
        car.distance();
        System.out.println();
        truck.cargo();
        System.out.println();
        civilAirplane.passengers();
        System.out.println();
        militaryAirplane.shot();
        militaryAirplane.catapult();


    }
}
