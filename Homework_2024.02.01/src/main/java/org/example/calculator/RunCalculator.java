package org.example.calculator;

public class RunCalculator {
    public static void main(String[] args) {

        CalculateIntegers integer1 = new CalculateIntegers();
        CalculateDoubles double1 = new CalculateDoubles();
        CalculateBytes byte1 = new CalculateBytes();

        System.out.println(integer1.calculate(6278, 3249, MathOperations.PLUS));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(double1.calculate(23.47, 27.34, MathOperations.MINUS));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(byte1.calculate((byte) 37, (byte) 56, MathOperations.MULT));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(integer1.calculate(6278, 55, MathOperations.DIV));
    }
}

//      1. Создайте обобщенный интерфейс для калькулятора,
//      в котором будет объявлен перечень операций,
//      которые умеет делать ваш калькулятор add, sub, multi и div
//      и реализуйте классы, которые будут включать данный интерфейс для работы с различными типами данных аргументов.
