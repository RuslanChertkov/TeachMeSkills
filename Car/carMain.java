package Car;

public class carMain {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 39.300, 150);
        Car car2 = new Car("BMW", 25000, 140);
        car1.start();
        System.out.println();
        car2.start();
    }
}
