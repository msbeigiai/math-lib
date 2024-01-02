package com.msbeigi.base;

import com.msbeigi.output.Print;

public class Matrix extends LinearAlgebra {
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
    public void printMat() {
        Print print = new Print(this);
        print.printMat();
    }


}
