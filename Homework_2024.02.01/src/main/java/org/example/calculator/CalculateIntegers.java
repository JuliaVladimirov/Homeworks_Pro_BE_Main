package org.example.calculator;

public class CalculateIntegers implements CalculateGeneric<Integer> {


    @Override
    public Integer calculate(Integer num1, Integer num2, MathOperations operation) {
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
                if (num2 == 0) {
                    throw new RuntimeException("Second number cannot be less than 0. You cannot divide by zero");
                }
                return num1 / num2;

            default:
                throw new RuntimeException("The math operation sign is not right. Please, provide PLUS,MINUS,MULT or DIV.");

        }
    }
}
