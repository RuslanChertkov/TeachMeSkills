package lesson2;

public class cycle2 {
    public static void main(String[] args) {
        int population = 10000000;
        int death = 8;
        int born = 14;
        for (int i = 1; i<=10; i++) {
            if (born>7) born -= 1;
            if (death>6) death-=1;
            population += (population / 1000) * (born - death);
        }
        System.out.println("Численность" + population);
        }
    }

