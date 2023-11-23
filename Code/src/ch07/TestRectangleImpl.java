package ch07;

public class TestRectangleImpl {
    public static void main(String[] args) {
        IShape r = new RectangleImpl(10., 20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}
