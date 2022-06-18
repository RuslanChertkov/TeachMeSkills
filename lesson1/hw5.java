package lesson1;

public class hw5 {
    public static void main(String[] args) {
        int a = 10;
        int counter = 0;
        while ((a /= 10) != 0) {
            counter++;
        }
        System.out.println(counter);
            if(a< 99&&a>=10) {
        System.out.println(2);
    }
        if(a< 9&&a >=1){
        System.out.println(1);
    }
}
}
