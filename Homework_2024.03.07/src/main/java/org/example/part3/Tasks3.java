package org.example.part3;

import java.util.Arrays;
import java.util.List;

public class Tasks3 {
    public static void main(String[] args) {


//  Задание A:

//              - Отфильтровать на четные и не четные

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Отфильтровать на четные и не четные:");
        System.out.println(evenNumbers + "\n");

//              - Просуммировать все числа

        Integer sum = numbers.stream()
                .reduce(Integer::sum).orElse(0);

        System.out.println("Просуммировать все числа:");
        System.out.println(sum + "\n");

//              - Получить среднее значение

        Double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics().getAverage();

        System.out.println("Получить среднее значение:");
        System.out.println(average + "\n");


//              - Найти суммы чисел кратных 3 и 5

        Integer sumOfNumbers = numbers.stream()
                .filter (num -> num % 3 == 0 || num % 5 == 0)
                .reduce(Integer::sum).orElse(0);

        System.out.println("Найти суммы чисел кратных 3 и 5:");
        System.out.println(sumOfNumbers + "\n");

//  Задание В:

//              - Преобразовать список строк в список чисел

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numList = strings.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println("Преобразовать список строк в список чисел:");
        System.out.println(numList + "\n");


//          - Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        List<String> sortedWords = words.stream()
                .filter (word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр:");
        System.out.println(sortedWords + "\n");

//          - Получить список слов которые содержат только уникальные символы

        List<String> uniqueWords = words.stream()
                .filter(word -> word.chars().distinct().toArray().length == word.chars().toArray().length)
                .toList();

        System.out.println("Получить список слов которые содержат только уникальные символы:");
        System.out.println(uniqueWords + "\n");

    }
}