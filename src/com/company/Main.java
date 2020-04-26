package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.7, Color.Black, false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();

        Square s1 = new Square();
        Square s2 = new Square(7.0);
        Square s3 = new Square(3.0,Color.Blue,false);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
