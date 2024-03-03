package org.example.task2;

//2*) Создать лямбда выражение, которое возвращает значение true,
//если строка не null, используя функциональный интерфейс Predicate.
//
//Создать лямбда выражение, которое проверяет, что строка не пуста,
//используя функциональный интерфейс Predicate.
//
//Написать программу проверяющую, что строка не null и не пуста,
//используя функциональный интерфейс Predicate.
//
//Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
//и заканчивается “A”. Используем функциональный интерфейс Predicate.
//
//Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
//
//Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
//Используем функциональный интерфейс Supplier.

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {

//        Predicate<String> predicate = (text) -> {
//            boolean result = text.equals(null);
//            return result;
//        };
//        System.out.println(predicate.test("Predicate"));
//
//
////------------------------------------------------------------------------------------------------------
//
//        predicate = (text) -> text.equals("");
//        System.out.println(predicate.test("Predicate"));
//        System.out.println(predicate.test(""));
//
////------------------------------------------------------------------------------------------------------
//
//        predicate = (text) -> {
//            boolean result = (text.equals(null) && text.equals("")) ;
//            return result;
//        };
//        System.out.println(predicate.test("Predicate"));

//-------------------------------------------------------------------------------------------------------

        Predicate<String> predicate = (text) -> {
            boolean result = (text.startsWith("J") || text.startsWith("N") && text.endsWith("A")) ;
            return result;
        };
        System.out.println(predicate.test("Johana"));
        System.out.println(predicate.test("Nonna"));
        System.out.println(predicate.test("James"));



    }
    }


