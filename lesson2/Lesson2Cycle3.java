package lesson2;

public class Lesson2Cycle3 {
    public static void main(String[] args) {
        int res=0;
        for (int i=1; i<=256; i*=2){
         res+=i;
        }
        System.out.println("Ответ:" + res);
    }
}
