package org.example.homework_2024_02_01.calculator2;

public class Main {
    public static void main(String[] args) {
        IntegerProcessing intNum = new IntegerProcessing();
        System.out.println(intNum.add(2, 3));
        System.out.println(intNum.sub(2, 3));
        System.out.println(intNum.multi(2, 3));
        System.out.println(intNum.div(2, 3));

        DoubleProcessing doubleNum = new DoubleProcessing();
        System.out.println(doubleNum.add(5.2, 3.7));
        System.out.println(doubleNum.sub(5.2, 3.7));
        System.out.println(doubleNum.multi(5.2, 3.7));
        System.out.println(doubleNum.div(5.2, 3.7));
    }


}
