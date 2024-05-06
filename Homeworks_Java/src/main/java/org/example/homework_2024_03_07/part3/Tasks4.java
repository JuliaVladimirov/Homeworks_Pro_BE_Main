package org.example.homework_2024_03_07.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks4 {
    public static void main(String[] args) {

//  Задание 1: Фильтрация списка целых чисел на нечетные числа

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .toList();

        System.out.println("Фильтрация списка целых чисел на нечетные числа:");
        System.out.println(oddNumbers + "\n");

//  Задание 2: Преобразование списка строк в список чисел

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> convertedNumbers = strings.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println("Преобразование списка строк в список чисел:");
        System.out.println(convertedNumbers + "\n");

//  Задание 3: Суммирование списка чисел

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers1.stream()
                .reduce(Integer::sum).orElse(0);

        System.out.println("Суммирование списка чисел:");
        System.out.println(sum + "\n");

//  Задание 4: Определение максимального значения в списке

        Integer maxNum = numbers1.stream()
                .max(Comparator.naturalOrder()).orElse(0);

        System.out.println("Определение максимального значения в списке:");
        System.out.println(maxNum + "\n");

//  Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре

        List<String> words = Arrays.asList("apple", "banana", "apricot", "kiwi", "cherry", "ananas");
        List<String> sortedWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре:");
        System.out.println(sortedWords + "\n");

//  Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        List<String> words1 = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> uniqueWords = words1.stream()
                .distinct()
                .filter(word -> word.length() > 4)
                .toList();

        System.out.println("Получение списка уникальных слов из списка строк, длина которых больше 4 символов:");
        System.out.println(uniqueWords + "\n");

//  Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту

        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        List<String> names = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .toList();

        System.out.println("Преобразование списка объектов класса в список их имен, отсортированных по возрасту:");
        System.out.println(names + "\n");


//  Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел

        Integer sumOfNumbers = numbers.stream()
                .filter (num -> num % 3 == 0 || num % 5 == 0)
                .reduce(Integer::sum).orElse(0);

        System.out.println("Нахождение суммы чисел, кратных 3 и 5, из списка чисел:");
        System.out.println(sumOfNumbers + "\n");

//  Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк

        List<String> words2 = Arrays.asList("Apple", "Potato", "Olive", "Cherry", "Avocado", "Onion", "Banana", "Peach", "Ananas", "Tomato", "Orange");
        List<String> uniqueWords2 = words2.stream()
                .filter(word -> word.toLowerCase().chars().distinct().toArray().length == word.toLowerCase().chars().toArray().length)
                .toList();

        System.out.println("Получение списка слов, содержащих только уникальные символы, из списка строк:");
        System.out.println(uniqueWords2);
    }
}



