package com.msbeigi.base;

import com.msbeigi.output.Print;

public class Vector extends LinearAlgebra {

    private int length;

    public Vector() {
    }

    public Vector(int m) {
        super(m, 1);
    }

    public Vector(int mRow, String elements) {
        super(mRow, 1);
        parseMatrixString(elements);
    }

    public int length() {
        return m;
    }

    public Vector add(Vector v2) {
        Vector vector = new Vector(length());
        if (this.length() != v2.length()) {
            throw new IllegalArgumentException("Two vectors has not same length");
        }

        for (int i = 0; i < this.length(); i++) {
            vector.X[i][0] = X[i][0] + v2.X[i][0];
        }
        return vector;
    }

    public Vector subtract(Vector v2) {
        Vector vector = new Vector(length());
        vector = v2.multiply(-1.0).add(this);
        return vector;
    }

    public Vector multiply(Vector v2) {
        Vector vector = new Vector(length());
        if (this.length() != v2.length()) {
            throw new IllegalArgumentException("Two vectors has not same length");
        }
        for (int i = 0; i < this.length(); i++) {
            vector.X[i][0] = X[i][0] * v2.X[i][0];
        }
        return vector;
    }
    public Vector multiply(double x) {
        Vector vector = new Vector(length());

        for (int i = 0; i < this.length(); i++) {
            vector.X[i][0] = x * X[i][0];
        }
        return vector;
    }


    @Override
    public void printMat() {
        Print print = new Print(this);
        print.printMat();
    }
}
