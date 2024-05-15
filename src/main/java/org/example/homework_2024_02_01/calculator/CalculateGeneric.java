package org.example.homework_2024_02_01.calculator;

public interface CalculateGeneric<N extends Number> {
    N calculate(N num1, N num2, MathOperations operation);
}