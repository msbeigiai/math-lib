package com.msbeigi.base;

public class Matrix extends LinearAlgebra {
    public Matrix(){}

    public Matrix(int m, int n) {
        super(m, n);
    }

    public Matrix(int mRow, int nCol, String matrix) {
        super(mRow, nCol);
        parseMatrixString(matrix);
    }

    private void parseMatrixString(String matrixString) {
        String[] elements = matrixString.replaceAll("[\\[\\] ]", "").split(",");

        if (elements.length != m * n) {
            throw new IllegalArgumentException("Invalid matrix dimensions");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = Double.parseDouble(elements[i * n + j]);
            }
        }
    }


}
