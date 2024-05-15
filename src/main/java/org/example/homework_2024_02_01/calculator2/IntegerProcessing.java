package org.example.homework_2024_02_01.calculator2;

public class IntegerProcessing implements NumericalOperations<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На 0 делить нельзя");
        }
    }
}