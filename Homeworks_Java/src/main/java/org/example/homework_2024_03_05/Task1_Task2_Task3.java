package org.example.homework_2024_03_05;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1_Task2_Task3 {
    public static void main(String[] args) {

//      1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//      Сколько раз объект «Big» встречается в коллекции?

        List<String> list = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long countNum = list.stream()
                .filter(word -> word.contains("Big"))
                .count();
        System.out.println("Слово 'Big' встречается " + countNum + " раз/раза.\n");

//      2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")

        List<String> list1 = Arrays.asList("a1", "b5", "a2", "b4");
        String listResult = list1.stream()
                .sorted()
                .findFirst().get();
        System.out.println("Самый маленький элемент в массиве: " + listResult + "\n");

//        3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//        Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> list2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> listResult1 = list2.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println(listResult1);


    }
}
