package org.example.part3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks6 {
    public static void main(String[] args) {

//  Для тех, кому все легко

//  Задача 1: Найти k-ую перестановку из n элементов
//  Дано число n и число k, необходимо найти k-ую перестановку из n элементов.
// Александр, в этой задаче я не поняла условие, от слова "совсем" ...(((((




//  Задача 2: Разбить список на подсписки заданного размера
//  Дан список элементов и размер подсписков. Необходимо разбить список
//  на подсписки указанного размера.
        List<Integer> originalList = Arrays.asList(1, 24, 13, 41, 22, 6, 10, 37, 7, 31, 48, 12);
        int listLength = 4;
        AtomicInteger counter = new AtomicInteger();

        Collection<List<Integer>> result = originalList.stream()
                .collect(Collectors.groupingBy(num -> counter.getAndIncrement() / listLength))
                .values();
        System.out.println(result);


// Для людей-индиго
// Задача 3:Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.

        Integer sum = IntStream.range(0, 100).boxed()
                .map(Object::toString)
                .filter(word ->
                {
                    for (int i = 0; i < word.length() / 2; i++) {
                        if (word.charAt(i) == word.charAt((word.length() - 1) - i)) {
                            return true;
                        }
                    }
                    return false;
                })
                .map(Integer::parseInt)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .reduce(0, (acc, num) -> acc + num*num);

        System.out.println("Сумма квадратов простых чисел, которые являются палиндромами в заданном диапазоне:");
        System.out.println(sum + "\n");

    }
}
