package com.company;

public class Circle implements Figures {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double square() {
        double sq = Math.PI * Math.pow(radius, 2);
        return sq;
    }
}
