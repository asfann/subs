package com.company;

public class Square extends Rectangle {


    public Square(){

    }

    public Square(double side){

    }

    public Square(double side, Color color, boolean filled){
        super(side,side,color,filled);

    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "A Square with side "+ getSide() +", which is a subclass of " + super.toString();
    }
}
