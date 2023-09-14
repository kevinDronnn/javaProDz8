package com.company;

public class Triangle implements Figures {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        double sq = 1 / 2 * (a * h);
        return sq;
    }
}
