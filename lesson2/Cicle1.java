package lesson2;

public class Cicle1 {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        for (int i = 1; i <= 10; i++) {
            population += (population / 1000) * (born - death);
        }
        System.out.println("Численность:"+population);
    }
}
