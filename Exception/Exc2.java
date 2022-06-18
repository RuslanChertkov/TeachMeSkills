package Exception;

public class Exc2 {
    public static void main(String[] args) {
        try{
            int d = 0;
            int a = 42 / d;
        }
        catch (ArithmeticException e){
            System.out.print("division by zero!");
        }
    }
    /*int f = 0;
    int r = 42 / f;*/
}
