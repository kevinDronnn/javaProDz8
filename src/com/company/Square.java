package com.company;

public class Square implements Figures {
    private double a;

    public Square(int a) {
        this.a = a;
    }


    @Override
    public double square() {
        double sq = Math.pow(a, 2);
        return sq;
    }
}
