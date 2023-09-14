package com.company;

public class Main implements SumSquare {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Square square = new Square(2);
        Triangle triangle = new Triangle(3, 5);
        SumSquare.sum(circle, square, triangle);
    }
}
