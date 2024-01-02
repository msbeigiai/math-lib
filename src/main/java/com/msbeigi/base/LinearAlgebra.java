package com.msbeigi.base;

import com.msbeigi.output.Print;

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

    public abstract void printMat();

    protected void parseMatrixString(String matrixString) {
        String[] elements = matrixString.replaceAll("[\\[\\] ]", "").split(",");

        if (elements.length != m * n) {
            throw new IllegalArgumentException("Invalid matrix dimensions");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = Double.parseDouble(elements[i * n + j]);
            }
        }
    };
}
