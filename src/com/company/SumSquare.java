package com.company;

public interface SumSquare {
    public static void sum(Circle circle, Square square, Triangle triangle) {
        double res = circle.square() + square.square() + triangle.square();
        System.out.println(res);
    }
}
