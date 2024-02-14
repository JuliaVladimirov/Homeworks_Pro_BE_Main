package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        1. В стране Лимпопо количество всех зверей равно 10 миллионов.
//        Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//        Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//        что показатели рождаемости и смертности постоянны.


        List<Integer> numberOfAllAnimals = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            numberOfAllAnimals.add(1);
        }
        System.out.println(numberOfAllAnimals.size());


        ListIterator<Integer> iterator = numberOfAllAnimals.listIterator();
        int count = 1;
        while (iterator.hasNext()) {
            iterator.next();
            if (count % 1000 == 0) {
                for (int i = 0; i < (14 - 8); i++) {
                    iterator.add(1);
                }
            }
            count++;
        }
        System.out.println("Через 10 лет зверей будет: " + (numberOfAllAnimals.size() * 10));
        // поскольку тема урока была "итераторы", то я задание выполнила через ListIterator.
        // Но это нереально долго, а именно операция add() (и через цикл и просто добавлением), мой копьютер с трудом справился где-то за 15-20 минут. Видимо памяти не хватает. Так быть не должно, конечно.
        //Уменьшила изначальное количество до 5-ти миллионов, иначе очень печально.



//        2*. - создать лист, наполнить его 10 млн. элементов
//        внутри тела просто будем присваивать i-тый элемент в переменную temp
//
//        перебрать весь список и замерять время выполнения:
//        а) с помощью for-each loop
//        b) классический for, с выполнением условия i<list.size()
//        c) классический for, но проходим список с конца до начала (i--)
//        d) используя Iterator
//        e) используя ListIterator и перемещаясь от начала списка до конца
//        e) используя ListIterator с перемещением от конца списка к началу
//        Замер производительности делать для каждого из подпунктов отдельно,
//        используя например сходный шаблон кода: инструкцию java:
//        long startTime = System.currentTimeMillis();
//        //…… Ваша реализация перебора списка, например
//        for (int i : list) {
//        int temp = i;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("for-each loop: " + (endTime - startTime));
//        время выполнения каждого перебора вывести в консоль
//        Определите, какой вариант перебора списка работает быстрее всего.

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list1.add(1);
        }
//------------------------------- for-each loop ------------------------------

        long startTime = System.currentTimeMillis();
        for (Integer i : list1) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for-each loop: " + (endTime - startTime));

//------------------------------- for-i loop ------------------------------
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < list1.size(); i++) {
            int temp = i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("for-i loop: " + (endTime1 - startTime1));

//------------------------------- Iterator loop ------------------------------
        long startTime2 = System.currentTimeMillis();
        Iterator<Integer> iterator1 = list1.iterator();

        while (iterator1.hasNext()) {
            int temp = iterator1.next();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Iterator loop: " + (endTime2 - startTime2));

//------------------------------- listIterator loop ------------------------------
        long startTime3 = System.currentTimeMillis();
        ListIterator<Integer> iterator2 = list1.listIterator();

        while (iterator2.hasNext()) {
            int temp = iterator2.next();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("ListIterator loop: " + (endTime3 - startTime3));

//------------------------------- listIterator loop reversed------------------------------
        long startTime4 = System.currentTimeMillis();
        ListIterator<Integer> iterator3 = list1.listIterator(list1.size());

        while (iterator3.hasPrevious()) {
            int temp = iterator3.previous();
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("ListIterator loop reversed: " + (endTime4 - startTime4));


    }
}
