package org.example.calculator2;

public class DoubleProcessing implements NumericalOperations<Double> {
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double div(Double a, Double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}
