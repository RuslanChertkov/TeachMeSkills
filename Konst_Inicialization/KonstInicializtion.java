package Konst_Inicialization;

public class KonstInicializtion {
    public static void main(String[] args) {

        Point pt = new Point();
        Point pt2 = new Point(2, 5);
        System.out.printf(" x=" + pt.x + " y=" + pt.y + " color ="+pt.color);
        System.out.printf("\n x=" + pt2.x + " y=" + pt2.y + " color ="+pt.color);
    }
}

class Point {
    int x, y;
    int color;

    //инициализатор
    {
        x = -1;
        y = -1;
        color = 100;
    }

    Point() {           //позволяет создавать объекты без аргументов!
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
