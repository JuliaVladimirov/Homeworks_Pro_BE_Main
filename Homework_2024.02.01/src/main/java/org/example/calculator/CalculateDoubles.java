package org.example.calculator;

public class CalculateDoubles implements CalculateGeneric<Double> {


    @Override
    public Double calculate(Double num1, Double num2, MathOperations operation) {
        System.out.println("First number is " + num1 + ".");
        System.out.println("Second number is " + num2 + ".");
        System.out.println("The math operation is " + operation + ".");
        System.out.println("The result is:");

        switch (operation) {
            case MathOperations.PLUS:
                return num1 + num2;

            case MathOperations.MINUS:
                return num1 - num2;

            case MathOperations.MULT:
                return num1 * num2;

            case MathOperations.DIV:
                if (num2 == 0.0) {
                    throw new RuntimeException("Second number cannot be less than 0.0. You cannot divide by zero");
                }
                return num1 / num2;

            default:
                throw new RuntimeException("The math operation sign is not right. Please, provide PLUS,MINUS,MULT or DIV.");

        }
    }
}
