package com.msbeigi.base;

import com.msbeigi.output.Print;

public class Matrix extends LinearAlgebra implements MatrixGeo {
    public Matrix(){}

    public Matrix(int mRow, int nCol) {
        super(mRow, nCol);
    }

    public Matrix(int squareSize) {
        super(squareSize, squareSize);
    }

    public Matrix(int mRow, int nCol, String elements) {
        super(mRow, nCol);
        parseMatrixString(elements);
    }

    public Matrix(int squareSize, String elements) {
        this(squareSize);
        parseMatrixString(elements);
    }

    @Override
    public Matrix identity() {
        Matrix identity = new Matrix(m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) identity.X[i][j] = 1.0;
            }
        }
        return identity;
    }

    @Override
    public Matrix addition(Matrix other) {
        if (other.m != this.m && other.n != this.n) {
            throw new IllegalArgumentException("Matrices row and columns should be equal.");
        }
        Matrix matrix = new Matrix(m, n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrix.X[i][j] = this.X[i][j] + other.X[i][j];
            }
        }
        return matrix;
    }

    @Override
    public Matrix subtraction(Matrix other) {
        return this.addition(other.multiplication(-1.0));
    }

    @Override
    public Matrix multiplication(double scalar) {
        Matrix matrix = new Matrix(this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrix.X[i][j] = this.X[i][j] * scalar;
            }
        }
        return matrix;
    }

    @Override
    public Matrix multiplication(Matrix other) {
        if (this.n != other.m) {
            throw new IllegalArgumentException("The first matrices column is not equal to other matrices row");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrix.X[i][j] += this.X[i][j] * other.X[j][i];
            }
        }
        return matrix;
    }
}
