package com.msbeigi.base;

import com.msbeigi.output.Print;

public class Vector extends LinearAlgebra {

    public Vector() {
    }

    public Vector(int m) {
        super(m, 1);
    }

    public Vector(int mRow, String elements) {
        super(mRow, 1);
        parseMatrixString(elements);
    }

    @Override
    public void printMat() {
        Print print = new Print(this);
        print.printMat();
    }
}
