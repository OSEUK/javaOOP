package ch06;

class Point {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    @Override
    public String toString() {
        String msg = "(" + x + ", " + y + ")";
        return msg;
    }
}

class Circle {
    private double radius;
    private Point p;
    public Circle(){}
    public Circle(Point p, double r) {
        this.p = p;
        this.radius = r;
    }
    public Circle(int x, int y, double r){
        p = new Point(x, y);
        this.radius = r;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
class TestPoint {
    public static void main(String[] args) {

        Circle myCircle = new Circle(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);
    }
}