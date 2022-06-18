package Rectangle;

public class Main {
    public static void main(String[] args) {
        Rect r1 = new Rect(0,0,10,20);
        Rect r2 = new Rect(10,50,40,70);
        r1.setLeftTop(4,7);
       int s1 = r1.square();
       int s2=r2.square();
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Rect {
    int x1, y1;
    int x2, y2;

    Rect() {
    }

    Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void setLeftTop(int x, int y){
        this.x1=x;
        this.y1=y;
    }

    int square() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
}
