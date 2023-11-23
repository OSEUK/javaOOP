package ch07;

public class ARectangle extends AbstractShape{
    private double width, height;

    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }
}
