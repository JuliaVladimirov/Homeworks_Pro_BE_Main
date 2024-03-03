package org.example.task1;

//        1) Написать функциональный интерфейс Printable, который содержит один метод void print(String text).
//        Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами,
//        и маленькими буквами.
//        Возможно ли данный интерфейс заменить одним из стандартных функциональных интерфейсов?
//        Если да, приведите пример.


import java.util.function.Consumer;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Functional Interfaces:");

        Printable printable = (text) -> {
            System.out.println(text.toUpperCase());
            System.out.println(text.toLowerCase() + "\n");
        };
        printable.print("I Love Functional Interfaces");

        System.out.println("Standard Functional Interfaces:");

        Consumer<String> print = (text) -> {
            System.out.println(text.toUpperCase());
            System.out.println(text.toLowerCase() + "\n");
        };
        print.accept("I Love Standard Functional Interfaces");
    }
}

