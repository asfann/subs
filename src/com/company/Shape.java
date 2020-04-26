package com.company;

public class Shape {
    private Color color;
    private boolean filled;

    public Shape() {
        color = Color.Green;
        filled = true;
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
       return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of" + color + " and " + (filled?"filled":"not filled");
    }
}
