package Konstruktor;

public class Main {
    public static void main(String[] args) {
        Point pt = new Point();
        Point pt2 = new Point(2,5);
        System.out.printf(" x=" + pt.x + " y=" + pt.y);
        System.out.printf("\n x=" + pt2.x + " y=" + pt2.y);
    }
}

class Point {
    int x, y;

    Point() {                    //перегрузка конструктора (создаём в классе несколько крнструкторов)
        x = -1; y = -1;          //перегрузка конструктора
        int color = 0;           //перегрузка конструктора
    }                            //перегрузка конструктора
    Point(int x, int y){         //перегрузка конструктора
          this();                //перегрузка конструктора. С помощью this() мы можем вызвать прошлый конструтор без аргументов!
        this.x = x; this.y = y;  //перегрузка конструктора
    }                            //перерузка конструктора

   /* Point(int argx,int argy){
        x=argx; y=argy;
    }  */
}
