package org.example.task5;

import java.util.ArrayList;
import java.util.Collections;

//         5*)
//         Перебрать ArrayList и найти второй по величине элемент.
//         Перебрать ArrayList и вывести все элементы в обратном порядке.
//         Перебрать ArrayList и вывести все строки, содержащие только буквы.
//         Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
//         Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.



public class ArrayListExercises5 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(33);
        arraylist1.add(15);
        arraylist1.add(20);
        arraylist1.add(34);
        arraylist1.add(8);
        arraylist1.add(12);
        arraylist1.add(7);
        arraylist1.add(10);
        arraylist1.add(25);
        System.out.println(arraylist1);

        System.out.println(find2ndMaxElement(arraylist1));

        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(1);
        arraylist2.add(2);
        arraylist2.add(3);
        arraylist2.add(4);
        arraylist2.add(5);
        arraylist2.add(6);
        arraylist2.add(7);
        arraylist2.add(8);
        arraylist2.add(9);
        System.out.println(arraylist2);

        convertArray(arraylist2);
        System.out.println(arraylist2);

        ArrayList<String> arraylist3 = new ArrayList<>();
        arraylist3.add("Bill");
        arraylist3.add("Smith");
        arraylist3.add("New-York");
        arraylist3.add("Green Alley Str. 23");
        arraylist3.add("034-52186534");
        arraylist3.add("bill.smith@gmail.com");
        System.out.println(arraylist3);

        printStringsWithLetters(arraylist3);

        ArrayList<String> arraylist4 = new ArrayList<>();
        arraylist4.add("Don't judge a book by its cover.");
        arraylist4.add("Don'tJudgeABookByTtsCover.");
        arraylist4.add("An apple a day keeps the doctor away.");
        arraylist4.add("AnAppleADayKeepsTheDoctorAway.");
        arraylist4.add("Better late than never.");
        arraylist4.add("BetterLateThanNever.");
        System.out.println(arraylist4);

        System.out.println(printLongestString(arraylist4));

        ArrayList<House> arraylist5 = new ArrayList<>();
        House house1 = new House(3.50, 4);
        arraylist5.add(house1);
        House house2 = new House(6.20, 7);
        arraylist5.add(house2);
        House house3 = new House(5.10, 8);
        arraylist5.add(house3);
        House house4 = new House(7.50, 10);
        arraylist5.add(house4);
        House house5 = new House(3.90, 5);
        arraylist5.add(house5);
        House house6 = new House(4.80, 6);
        arraylist5.add(house6);
        System.out.println(arraylist5);

        System.out.println(getHeigestHouse(arraylist5));



    }

    public static int find2ndMaxElement(ArrayList<Integer> arrayList) { // возвращает второй по величине элемент - первый вариант с перебором
        int firstMaxElement = arrayList.get(0);
        int secondMaxElement = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (firstMaxElement < arrayList.get(i)) {
                secondMaxElement = firstMaxElement;
                firstMaxElement = arrayList.get(i);
            }
        }
        return secondMaxElement;
    }

//    public static Integer find2ndMaxElement(ArrayList<Integer> arrayList) { // второй вариант - проще и быстрее
//        Collections.sort(arrayList);
//        return arrayList.get(arrayList.size() - 2);
//    }

    public static void convertArray(ArrayList<Integer> arrayList) { // выводит все элементы в обратном порядке.
        Integer temp;
        for (int i = 0; i < arrayList.size() / 2; i++) {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - (i + 1)));
            arrayList.set(arrayList.size() - (i + 1), temp);
        }
    }

    public static void printStringsWithLetters(ArrayList<String> arrayList) { // выводит все строки, содержащие только буквы.
        boolean isLetter = false;
        for (String string : arrayList) {
            for (int i = 0; i < string.length(); i++) {
                if ((string.codePointAt(i) > 64) && (string.codePointAt(i) < 91) || (string.codePointAt(i) > 96) && (string.codePointAt(i) < 123)) {
                    isLetter = true;
                } else {
                    isLetter = false;
                    break;
                }
            }
            if (isLetter) {
                System.out.println(string);
            }
        }
    }

    public static String printLongestString(ArrayList<String> arrayList) { //выводит самую длинную строку, не содержащую пробелов.
        int longestStringLength = 0;
        String longestString = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if ((!arrayList.get(i).contains(" ")) && longestStringLength < arrayList.get(i).length()) {
                longestStringLength = arrayList.get(i).length();
                longestString = arrayList.get(i);
            }
        }
        return longestString;

    }

    public static House getHeigestHouse (ArrayList<House> arrayList){//выводит самый высокий дом, у которого как минимум 6 окон.
        double maxHeight = 0;
        House heigestHouse = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i).getNumOfWindows() >= 6) && maxHeight < arrayList.get(i).getHeight()) {
                maxHeight = arrayList.get(i).getHeight();
                heigestHouse = arrayList.get(i);
            }
        }
        return heigestHouse;

    }


}