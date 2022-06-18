package Matrix;

import java.util.Random;

public class Matrix {
    private double[][] arr;
    private int line;
    private int column;

    public Matrix() {

    }

    public Matrix(int line, int column) {
        this.line = line;
        this.column = column;
        this.arr = new double[line][column];
        fillArray();
    }

    private void fillArray() {
        Random r = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = r.nextInt(20) * 1.1;
            }
        }
    }


    public void displayArr() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%8.2f", arr[i][j]);
            }
            System.out.println();
        }
    }


    public double [][] generateArray() {
        double[][] arr = new double[line][column];
        Random r = new Random();
        System.out.println("!Новая матрица!");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = r.nextInt(10) * 1.2;
                System.out.printf("%8.2f", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return arr;
    }

    public void summ(double[][] arr2) {
        System.out.println("\nСумма");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%8.2f", this.arr[i][j] += arr2[i][j]);
            }
            System.out.println();
        }

    }

    public void multiple(double[][] arr2) {
        System.out.println("\nПроизведение");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%8.2f", this.arr[i][j] *= arr2[i][j]);
            }
            System.out.println();
        }
    }


    public void multipleNumber(int number) {
        System.out.println("\nПроизведение на число");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] *= number;

                System.out.printf("%8.2f", arr[i][j]);
            }
            System.out.println();
        }
    }


}

