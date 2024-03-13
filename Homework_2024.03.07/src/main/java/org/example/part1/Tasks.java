package org.example.part1;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

//  Поток 1:
//  Задание 1: Фильтрация списка целых чисел на нечетные числа

        List<Integer> originalList = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> sortedList = originalList.stream()
                .filter(num -> num % 2 != 0)
                .toList();
        System.out.println("Фильтрация списка целых чисел на нечетные числа:");
        System.out.println(sortedList + "\n");


//  Задание 2: Преобразование списка строк в список чисел
        List<String> originalList1 = Arrays.asList("1", "24", "13", "41", "22", "6", "10", "37", "12", "7", "31", "2", "48", "12");
        List<Integer> sortedList1 = originalList1.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Преобразование списка строк в список чисел:");
        System.out.println(sortedList1 + "\n");

//  Задание 3: Суммирование списка чисел

        List<Integer> originalList2 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37);
        Integer sum = originalList2.stream()
                .reduce(Integer::sum).orElse(0);

        System.out.println("Суммирование списка чисел:");
        System.out.println(sum + "\n");

//  Задание 4: Определение максимального значения в списке

        List<Integer> originalList3 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        Optional<Integer> maxElement = originalList3.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Суммирование списка чисел:");
        System.out.println(maxElement + "\n");


//  Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр

        List<String> originalList4 = Arrays.asList("Apple", "Cherry", "Avocado", "Banana", "Peach", "Ananas", "Tomato");
        List<String> finalList4 = originalList4.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр:");
        System.out.println(finalList4 + "\n");


//  Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        List<String> originalList5 = Arrays.asList("Apple", "Cherry", "Avocado", "Banana", "Peach", "Ananas", "Tomato");
        List<String> finalList5 = originalList5.stream()
                .filter(word -> word.length() > 5) // я заменила на 5, поскольку в списке не было коротких слов, а выдумывать не хотелось :)))))
                .toList();

        System.out.println("Получение списка уникальных слов из списка строк, длина которых больше 4 символов:");
        System.out.println(finalList5 + "\n");

//  Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------

        List<Person> originalList6 = Arrays.asList(
                new Person ("Ben", 25),
                new Person ("Tom", 32),
                new Person ("Lucy", 23),
                new Person ("Greg", 45),
                new Person ("Joy", 41),
                new Person ("Mary", 55),
                new Person ("John", 48));

        List<String> finalList6 = originalList6.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .toList();

        System.out.println("Преобразование списка объектов класса в список их имен, отсортированных по возрасту:");
        System.out.println(finalList6 + "\n");


//  Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------

        List<Integer> originalList7 = Arrays.asList(1, 24, 13, 40, 21, 6, 10, 35, 12, 7, 30, 2, 48, 12);
        Integer sumOfElements = originalList7.stream()
                .filter(num -> num % 5 == 0 || num % 3 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Нахождение суммы чисел, кратных 3 и 5, из списка чисел:");
        System.out.println(sumOfElements + "\n");


//  Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк

        List<String> originalList9 = Arrays.asList("Apple", "Cherry", "Avocado", "Banana", "Peach", "Ananas", "Tomato", "Mango", "Cactus");
        List<String> resultWords9 = originalList9.stream()
                .filter(word -> word.toLowerCase().chars().distinct().toArray().length == word.toLowerCase().chars().toArray().length)
                .toList();
        System.out.println("Получение списка слов, содержащих только уникальные символы, из списка строк:");
        System.out.println(resultWords9);
    }
}