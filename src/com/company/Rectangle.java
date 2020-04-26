package com.company;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, Color color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A Rectangle with" + width + " and " + length + ", which is a subclass of" + super.toString();
    }
}
