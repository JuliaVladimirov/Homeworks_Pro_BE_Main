package org.example.homework_2024_02_09.task3;

import java.util.ArrayList;

//         3*)
//         Перебрать ArrayList и удалить все четные числа.
//         Перебрать ArrayList и объединить все элементы в одну строку.
//         Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.


public class ArrayListExercises3 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(1);
        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(4);
        arraylist1.add(5);
        arraylist1.add(6);
        arraylist1.add(7);
        arraylist1.add(8);
        arraylist1.add(9);
        System.out.println(arraylist1);

        deleteEvenNumbers(arraylist1);
        System.out.println(arraylist1);

//------------------------------------------------------------------------------------------------

        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("Птица");
        arraylist2.add("Говорун");
        arraylist2.add("отличается");
        arraylist2.add("умом");
        arraylist2.add("и");
        arraylist2.add("сообразительностью");
        System.out.println(arraylist2);

        mergeElements(arraylist2);

//------------------------------------------------------------------------------------------------

        ArrayList<Book> arraylist3 = new ArrayList<>();
        Book book1 = new Book("Война и мир", "Лев Толстой", 1300);
        arraylist3.add(book1);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 672);
        arraylist3.add(book2);
        Book book3 = new Book("Ромео и Джульетта", "Уильям Шекспир", 192);
        arraylist3.add(book3);
        Book book4 = new Book("Мастер и Маргарита", "Михаил Булгаков", 528);
        arraylist3.add(book4);
        Book book5 = new Book("Евгений Онегин", "Александр Пушкин", 224);
        arraylist3.add(book5);
        Book book6 = new Book("Герой нашего времени", "Михаил Лермонтов", 234);
        arraylist3.add(book6);
        System.out.println(arraylist3);

        printCertainElements(arraylist3);


    }

    public static void deleteEvenNumbers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
    }

    public static void mergeElements(ArrayList<String> arrayList) {
        String sentence = "";
        for (int i = 0; i < arrayList.size(); i++) {
            sentence += arrayList.get(i) + " ";
        }
        System.out.println(sentence);
    }

    public static void printCertainElements(ArrayList<Book> arrayList) { // выводит книги больше 250 страниц
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNumOfPages() > 250) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}


