package Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix arr = new Matrix(3, 3);
        Matrix arr2 = new Matrix(3, 3);
        arr.displayArr();
        arr.summ(arr2.generateArray());
        arr.multiple(arr2.generateArray());
        arr.multipleNumber(5);
    }
}
