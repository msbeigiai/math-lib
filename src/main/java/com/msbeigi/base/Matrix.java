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
}
