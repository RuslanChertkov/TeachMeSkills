package Transport;

public abstract class Transport {
    private double capacity;
    private int maxSpeed;
    private int weigh;
    private String brend;

    public Transport() {
    }

    public Transport(int capacity, int maxSpeed, int weigh, String brend) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weigh = weigh;
        this.brend = brend;
    }

    public double countCapacity() {
        double capacity = this.getCapacity() * 0.74;
        return capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }
}
