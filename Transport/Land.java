package Transport;

public class Land extends Transport {
    private int countWheels;
    public double fuelConsumption;

    public Land() {
    }

    public Land(int capacity, int maxSpeed, int weigh, String brend, int countWheels, int fuelConsumption) {
        super(capacity, maxSpeed, weigh, brend);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;

    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
