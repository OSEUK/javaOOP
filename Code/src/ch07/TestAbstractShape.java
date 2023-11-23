package ch07;

public class TestAbstractShape {
    public static void main(String[] args) {
        ARectangle r = new ARectangle(10., 20.);
        ACircle c = new ACircle(10);
        System.out.printf("사각형의 면적: %.2f\n", r.getArea());
        System.out.printf("사각형의 둘레: %.2f\n", r.getPerimeter());
        System.out.printf("원의 면적: %.2f\n", c.getArea());
        System.out.printf("원의 둘레: %.2f\n", c.getPerimeter());
    }
}
