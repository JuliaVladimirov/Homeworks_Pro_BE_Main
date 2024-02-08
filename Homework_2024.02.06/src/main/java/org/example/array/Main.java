package org.example.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DynamicIntArray array1 = new DynamicIntArray();
        System.out.println(Arrays.toString(array1.getArr()));

        DynamicIntArray array2 = new DynamicIntArray(5);
        System.out.println(Arrays.toString(array2.getArr()));

        array2.fill();
        System.out.println(Arrays.toString(array2.getArr()));

        array2.add(5);
        System.out.println(Arrays.toString(array2.getArr()));

        array2.add(8);
        System.out.println(Arrays.toString(array2.getArr()));

        array2.add(new int[]{7, 5, 6, 9});
        System.out.println(Arrays.toString(array2.getArr()));

        array2.insert(1, 8);
        System.out.println(Arrays.toString(array2.getArr()));

        array2.delete(6);
        System.out.println(Arrays.toString(array2.getArr()));

        array2.get(6);


    }
}
//         1) У вас есть класс DynamicIntArray. Внутри него есть 3 характеристики:
//         int lenght(реальный размер хранимых данных),
//         int capacity(размер массива),
//         массив int размером capacity (arr[capacity]),
//
//         константы:
//         начальный размер массива по умолчанию (DEFAULT_CAPACITY),
//         % изменения размера массива при автоматическом увеличении (PROCENT_CHANGE).

//         Реализуйте 2 конструктора:
//         по умолчанию (создается массив arr размером DEFAULT_CAPACITY)
//         с параметром capacity (создается массив arr размер которого передается параметром capacity).

//         Реализуйте методы:
//         add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
//         add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
//         insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива
//         и смещение элементов вправо)
//         delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
//         get(int index) - вернуть значение элемента по index
//
//
//