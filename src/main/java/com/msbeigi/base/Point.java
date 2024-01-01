package com.msbeigi.base;

public class Point extends Matrix {
    private double x;
    private double y;

    public Point() {}

    public Point(int x, int y) {
        super(2, 1);
        X[0][0] = x;
        X[1][0] = y;
        this.x = X[0][0];
        this.y = X[1][0];
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
