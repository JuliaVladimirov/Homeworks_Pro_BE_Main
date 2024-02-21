package org.example.linkedlist_previous_homework;

//3).**
//        Реализуйте класс UnidirectionIntLinkedList, в есть следующие характериcтики:
//        - int size; (текущий размер списка)
//        - Node (структура для хранения первого элемента списка)
//        В классе Node инкапулированы характеристики:
//        - int item; (для хранения данных)
//        - Node next; (для хранения ссылки на следующий объект хранения)
//        В классе UnidirectionIntLinkedList реализовать следующие методы:
//        - add(int): этот метод используется для добавления элемента в конец !!! списка.
//        - add(index, int): этот метод используется для добавления элемента по определенному индексу !!! в список.
//        - addFirst(int значение): добавляет элемент в начало списка.
//        - addLast(int значение): добавляет элемент в конец списка.
//        - int get(int index): получить элемент по index.
//        - int set(int index, int значение): установить значение элемента по index.
//        - int remove(int index): удалить элемент со списка, возвратить значение удаленного элемента
//        - removeFirst(): удалить элемент с начала списка.
//        - removeLast(): удалить элемент с конца списка.
//        - int indexOf(int значение): вернуть индекс первого вхождение элемента со значением
//        - bool contains(int значение): вернуть true, если значение есть в списке
//        - void clear(): очистить список

public class RunOneDirectionIntLinkedList {
    public static void main(String[] args) {

        OneDirectionIntLinkedList oneDirectionIntLinkedList = new OneDirectionIntLinkedList();

        oneDirectionIntLinkedList.add(5);
        oneDirectionIntLinkedList.add(4);
        oneDirectionIntLinkedList.add(7);
        oneDirectionIntLinkedList.add(2);
        oneDirectionIntLinkedList.add(6);
        System.out.println("add(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.add(1,8);
        System.out.println("add(index, item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.addFirst(10);
        System.out.println("addFirst(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.addLast(3);
        System.out.println("addLast(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("get(index)");
        System.out.println(oneDirectionIntLinkedList.get(2));
        System.out.println();

        oneDirectionIntLinkedList.set(3, 9);
        System.out.println("set(index, item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("remove(index)");
        System.out.println(oneDirectionIntLinkedList.remove(0));
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("removeFirst()");
        oneDirectionIntLinkedList.removeFirst();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("removeLast()");
        oneDirectionIntLinkedList.removeLast();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("int indexOf(int item)");
        System.out.println(oneDirectionIntLinkedList.indexOf(7));
        System.out.println(oneDirectionIntLinkedList.indexOf(5));
        System.out.println();

        System.out.println("boolean contains(int item)");
        System.out.println(oneDirectionIntLinkedList.contains(5));
        System.out.println(oneDirectionIntLinkedList.contains(7));
        System.out.println();

        System.out.println("clear()");
        oneDirectionIntLinkedList.clear();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("boolean isEmpty()");
        System.out.println(oneDirectionIntLinkedList.isEmpty());




    }
}

