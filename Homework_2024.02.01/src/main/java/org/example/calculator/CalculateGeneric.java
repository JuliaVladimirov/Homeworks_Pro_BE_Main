package org.example.calculator;

public interface CalculateGeneric<N extends Number> {
    N calculate(N num1, N num2, MathOperations operation);
}