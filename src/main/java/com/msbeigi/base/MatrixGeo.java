package com.msbeigi.base;

public interface MatrixGeo {
    Matrix identity();
    Matrix addition(Matrix other);
    Matrix subtraction(Matrix other);
    Matrix multiplication(double scalar);
    Matrix multiplication(Matrix other);
}
