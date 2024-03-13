package org.example.part2;

import org.example.part1.Person;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;


public class Tasks {
    public static void main(String[] args) {

//  Поток 2*:
//  Задача 1: Фильтрация четных чисел и умножение на 2.
        List<Integer> originalList1 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> finalList = originalList1.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();

        System.out.println("Фильтрация четных чисел и умножение на 2:");
        System.out.println(finalList + "\n");

//  Задача 2: Удаление дубликатов из списка строк.

        List<String> originalList2 = Arrays.asList("Apple", "Cherry", "Avocado", "Cherry", "Banana", "Peach", "Ananas", "Cherry", "Tomato");
        List<String> sortedList2 = originalList2.stream()
                .distinct()
                .toList();

        System.out.println("Удаление дубликатов из списка строк:");
        System.out.println(sortedList2 + "\n");

//  Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.

        List<Integer> originalList3 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> sortedList3 = originalList3.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println("Сортировка списка чисел в порядке убывания и выбор первых трех элементов:");
        System.out.println(sortedList3 + "\n");

//  Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        List<String> originalList4 = Arrays.asList("Apple", "Cherry", "Avocado", "Banana", "Peach", "Ananas", "Tomato");
        List<String> finalList4 = originalList4.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Фильтрация строк, начинающихся на \"A\" и преобразование в верхний регистр.");
        System.out.println(finalList4 + "\n");

//  Задача 5: Пропуск первых двух элементов и вывод оставшихся.

        List<Integer> originalList5 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> sortedList5 = originalList5.stream()
                .skip(2)
                .toList();

        System.out.println("Пропуск первых двух элементов и вывод оставшихся.");
        System.out.println(sortedList5 + "\n");

//  Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.

        List<Integer> originalList6 = Arrays.asList(1, 51, 13, 41, 86, 6, 10, 37, 12, 64, 31, 71, 48, 12);
        List<Integer> sortedList6 = originalList6.stream()
                .filter(num -> num > 50)
                .map(num -> num * num)
                .toList();

        System.out.println("Фильтрация чисел больше 50 и вывод их квадратов.");
        System.out.println(sortedList6 + "\n");

//  Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.

        List<String> originalList7 = Arrays.asList("Apple", "Potato", "Olive", "Cherry", "Avocado", "Onion", "Banana", "Peach", "Ananas", "Tomato", "Orange");
        List<String> finalList7 = originalList7.stream()
                .filter(word -> word.contains("o") || word.contains("O"))
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Оставить только слова, содержащие букву \"o\" и вывести их в обратном порядке.");
        System.out.println(finalList7 + "\n");


//  Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.

        List<Integer> originalList8 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> sortedList8 = originalList8.stream()
                .filter(num -> num % 2 != 0)
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println("Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.");
        System.out.println(sortedList8 + "\n");

//  Задача 9: Получить среднее значение чисел в списке.

        List<Integer> originalList9 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        OptionalDouble averageValue = originalList9.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Получить среднее значение чисел в списке.");
        System.out.println(averageValue + "\n");

//  Задача 10: Получить строку, объединяющую элементы списка через запятую.

        List<String> originalList10 = Arrays.asList("Apple", "Potato", "Olive", "Cherry", "Avocado", "Onion", "Banana", "Peach", "Ananas", "Tomato", "Orange");
        String finalString10 = originalList10.stream()
                .reduce((word1, word2) -> word1 + ", " + word2).orElse("");

        System.out.println("Получить строку, объединяющую элементы списка через запятую.");
        System.out.println(finalString10 + "\n");

//  Задача 11: Получить список квадратов чисел из другого списка.

        List<Integer> originalList11 = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 12, 7, 31, 2, 48, 12);
        List<Integer> powerList11 = originalList11.stream()
                .map(num -> (int)Math.pow(num,2))
                .toList();
        System.out.println("Получить список квадратов чисел из другого списка.");
        System.out.println(powerList11 + "\n");

//  Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.

        List<String> originalList12 = Arrays.asList("Apple", "Potato", "Olive", "Cherry", "Avocado", "Onion", "Banana", "Peach", "Ananas", "Tomato", "Orange");

        System.out.println("Получить список букв из списка слов и вывести их в алфавитном порядке.");
        for (String word : originalList12) {
            List<Character> list = word.chars()
                    .mapToObj(item -> (char) item)
                    .sorted()
                    .toList();
            System.out.println(list);// Решение совсем не идеальное, но пока лучше не получилось. Если вдруг будет минутка, хотелось бы услышать ваше решение. Заранее спасибо ;)
        }
        System.out.println();

//  Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.

        List<String> originalList13 = Arrays.asList("Apple", "Potato", "Olive", "Cherry", "Avocado", "Onion", "Banana", "Peach", "Ananas", "Tomato", "Orange");
        List<String> finalList13 = originalList13.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Получить первые 3 строки из списка и вывести их в обратном порядке.");
        System.out.println(finalList13 + "\n");

//  Задача 14: Пропустить первые 2 элемента и оставить только уникальные.

        List<Integer> originalList14 = Arrays.asList(1, 24, 41, 41, 22, 6, 22, 10, 12, 10, 12);
        List<Integer> finalList14 = originalList14.stream()
                .skip(2)
                .distinct()
                .toList();

        System.out.println("Пропустить первые 2 элемента и оставить только уникальные.");
        System.out.println(finalList14 + "\n");

//  Задача 15: Фильтрация и сортировка пользователей по возрасту.

        List<User> originalList15 = Arrays.asList(
                new User ("Ben", 25),
                new User ("Tom", 32),
                new User ("Lucy", 23),
                new User ("Greg", 45),
                new User ("Joy", 41),
                new User ("Mary", 55),
                new User ("John", 48));

        List<User> finalList15 = originalList15.stream()
                .filter(user -> user.getAge() < 40)
                .sorted(Comparator.comparing(User::getAge))
                .toList();

        System.out.println("Фильтрация и сортировка пользователей по возрасту.");
        System.out.println(finalList15 + "\n");
    }
}


