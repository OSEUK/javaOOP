package ch04;
import java.awt.Point;
public class Swap {
    void swap(Point a1, Point a2){
        Point temp1 = new Point(a1.x, a1.y);
        a1.x = a2.x;
        a1.y = a2.y;
        a2.x = temp1.x;
        a2.y = temp1.y;
    }

    public static void main(String[] args) {;
    }
}
