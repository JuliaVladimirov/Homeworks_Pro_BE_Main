package org.example.homework_2024_02_01.calculator;

public class CalculateBytes implements CalculateGeneric<Byte> {


    @Override
    public Byte calculate(Byte num1, Byte num2, MathOperations operation) {
        System.out.println("First number is " + num1 + ".");
        System.out.println("Second number is " + num2 + ".");
        System.out.println("The math operation is " + operation + ".");
        System.out.println("The result is:");

        switch (operation) {
            case MathOperations.PLUS:
                return (byte)(num1 + num2);

            case MathOperations.MINUS:
                return (byte)(num1 - num2);

            case MathOperations.MULT:
                return (byte)(num1 * num2);

            case MathOperations.DIV:
                if (num2 == 0) {
                    throw new RuntimeException("Second number cannot be less than 0. You cannot divide by zero");
                }
                return (byte)(num1 / num2);

            default:
                throw new RuntimeException("The math operation sign is not right. Please, provide PLUS,MINUS,MULT or DIV.");
        }
    }
}
