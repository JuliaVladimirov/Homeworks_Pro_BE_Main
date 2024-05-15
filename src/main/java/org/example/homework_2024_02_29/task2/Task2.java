package org.example.homework_2024_02_29.task2;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task2 {
    public static void main(String[] args) {

//  Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.

        Predicate<String> predicate = (text) -> text != null;

        System.out.println("Cтрока не null: " + predicate.test(null));
        System.out.println("Cтрока не null: " + predicate.test("Predicate"));

//------------------------------------------------------------------------------------------------------
//  Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.

        predicate = (text) -> !text.isEmpty();

        System.out.println("Cтрока не пуста: " + predicate.test("Predicate"));
        System.out.println("Cтрока не пуста: " + predicate.test(""));

//------------------------------------------------------------------------------------------------------
//Написать программу, проверяющую, что строка не null и не пуста, используя функциональный интерфейс Predicate.

        predicate = (text) -> (text != null && !text.isEmpty());
        System.out.println("Cтрока не null и не пуста: " + predicate.test("Predicate"));

//-------------------------------------------------------------------------------------------------------
//Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.

        predicate = (text) -> {
            text = text.toUpperCase();
            boolean result = (text.startsWith("J") && text.endsWith("A") || text.startsWith("N") && text.endsWith("A"));
            return result;
        };
        System.out.println("Строка начинается с буквы J или N и заканчивается буквой A:");
        System.out.println(predicate.test("Johana"));
        System.out.println(predicate.test("Nonna"));
        System.out.println(predicate.test("James"));

//-------------------------------------------------------------------------------------------------------
//  Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”, “Отрицательное число” или “Ноль”. Используем функциональный интерфейс Function.

        Function<Integer, String> function = (num) -> {
            String result;
            if (num == 0) {
                result = "Ноль";
            } else if (num > 0) {
                result = "Положительное число";
            } else {
                result = "Отрицательное число";
            }
            return result;
        };
        System.out.println("Число, которое было введено: " + function.apply(0));
        System.out.println("Число, которое было введено: " + function.apply(5));
        System.out.println("Число, которое было введено: " + function.apply(-5));

//-------------------------------------------------------------------------------------------------------
//Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный интерфейс Supplier.

        Supplier<Integer> supplier = () -> (int) ((Math.random() * 10));
        System.out.println("Случайное число от 0 до 10: " + supplier.get());
    }
}


