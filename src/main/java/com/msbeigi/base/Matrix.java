package com.msbeigi.base;

import com.msbeigi.output.Print;

public class Matrix extends LinearAlgebra {
    public Matrix(){}

    public Matrix(int m, int n) {
        super(m, n);
    }

    public Matrix(int mRow, int nCol, String matrix) {
        super(mRow, nCol);
        parseMatrixString(matrix);
    }

    @Override
    public void printMat() {
        Print print = new Print(this);
        print.printMat();
    }
}
