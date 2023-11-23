package ch07;

public class Rectangle {
    protected double height, width;
    protected boolean isSelected;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
