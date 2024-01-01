package com.msbeigi.base;

public class LinearAlgebra {
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
}
