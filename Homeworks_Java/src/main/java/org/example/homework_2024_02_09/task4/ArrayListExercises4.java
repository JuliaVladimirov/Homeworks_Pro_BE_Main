package org.example.homework_2024_02_09.task4;

import java.util.ArrayList;

//         4)
//         Перебрать ArrayList и найти сумму квадратов всех элементов.
//         Перебрать ArrayList и найти самую короткую строку.
//         Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ ''.

public class ArrayListExercises4 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(1);
        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(4);
        arraylist1.add(5);
        System.out.println(arraylist1);

        System.out.println("The square sum of all elements of the arraylist is: " + getSquareSum(arraylist1));

        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("white");
        arraylist2.add("black");
        arraylist2.add("green");
        arraylist2.add("blau");
        arraylist2.add("red");
        arraylist2.add("brown");
        arraylist2.add("grey");
        arraylist2.add("yellow");
        arraylist2.add("orange");
        System.out.println(arraylist2);


        System.out.println("The shortest word is: " + findShortestWord(arraylist2));

        replaceVowels(arraylist2);
        System.out.println(arraylist2);
    }


    public static int getSquareSum(ArrayList<Integer> arrayList) { // возвращает сумму квадратов всех элементов
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += (int) Math.pow(arrayList.get(i), 2);
        }
        return sum;
    }

    public static String findShortestWord(ArrayList<String> arrayList) { // выводит самую короткую строку.
        String shortestWord = arrayList.get(0);
        for (String word : arrayList) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static void replaceVowels(ArrayList<String> arrayList) { // заменяет все гласные буквы в каждой строке на символ ''
        char[] vowels = new char[]{'a','A','o','O', 'u', 'U', 'e', 'E', 'i', 'I'};

        for (int i = 0; i < arrayList.size(); i++) {
            for (char vowel:vowels) {
                arrayList.set(i, arrayList.get(i).replace(vowel, ' '));
            }
        }
    }
}

