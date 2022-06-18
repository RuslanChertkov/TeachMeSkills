package Transport;

public class Air extends Transport {
    private int wingspan;
    private int minRunway;

    public Air() {
    }

    public Air(int capacity, int maxSpeed, int weigh, String brend, int wingspan, int minRunway) {
        super(capacity,maxSpeed,weigh,brend);
        this.wingspan=wingspan;
        this.minRunway=minRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }
}
