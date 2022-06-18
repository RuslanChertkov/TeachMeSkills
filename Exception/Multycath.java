package Exception;

public class Multycath {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("division by zero!" + e);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of bounds!" + ex);
        }
    }
}
