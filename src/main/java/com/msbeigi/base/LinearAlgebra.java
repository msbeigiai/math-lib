package com.msbeigi.base;

public abstract class LinearAlgebra {
    protected double[][] X;
    protected int m;
    protected int n;

    public LinearAlgebra() {
        m = 1;
        n = 1;
        X = new double[m][n];
    }

    public LinearAlgebra(int m, int n) {
        this.m = m;
        this.n = n;
        X = new double[m][n];
    }

    public double[][] getX() {
        return X;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

}
