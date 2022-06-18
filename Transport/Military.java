package Transport;

public class Military extends Air {
    private boolean catapult;
    private int countRockets;

    public Military() {

    }

    public Military(int capacity, int maxSpeed, int weigh, String brend, int wingspan, int minRunway, boolean catapult, int countRockets) {
        super(capacity, maxSpeed, weigh, brend, wingspan, minRunway);
        this.catapult = catapult;
        this.countRockets = countRockets;

    }

    public void display() {
        System.out.printf("\nMilitary: \nCapacity:%.2f kW, \nMaxSpeed:%d km/h, \nWeigh:%d kg, \nBrend:%s, \nWingspan:%d, \nMinRunway:%d, \nCatapult:%b, \nRockets:%d;", this.countCapacity(), this.getMaxSpeed(), this.getWeigh(), this.getBrend(), this.getWingspan(), this.getMinRunway(), this.catapult, this.countRockets);
    }

    public void shot() {
        if (countRockets != 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутсвуют!");
        }
    }
    public void catapult(){
        if(catapult = true){
            System.out.println("Катапультирование прошло успешно!");
        }else{
            System.out.println("У вас нет такой системы!");
        }
    }
}
