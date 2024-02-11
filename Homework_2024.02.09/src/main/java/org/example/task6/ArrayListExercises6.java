package org.example.task6;

import java.util.ArrayList;
import java.util.List;

//         6*)
//         Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.
//         Перебрать ArrayList и удалить все дубликаты элементов.
//         Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
//         Перебрать ArrayList и объединить все строки в одну с использованием разделителя.

public class ArrayListExercises6 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist1 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arraylist1.add((int) (Math.random() * 100));
        }
        System.out.println(arraylist1);

        System.out.println(getMaxSubsequence(arraylist1));

        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(33);
        arraylist2.add(15);
        arraylist2.add(20);
        arraylist2.add(34);
        arraylist2.add(8);
        arraylist2.add(12);
        arraylist2.add(7);
        arraylist2.add(10);
        arraylist2.add(25);
        arraylist2.add(8);
        arraylist2.add(12);
        arraylist2.add(7);
        System.out.println(arraylist2);

        deleteDuplicates(arraylist2);
        System.out.println(arraylist2);

        ArrayList<String> arraylist3 = new ArrayList<>();
        arraylist3.add("Moscow");
        arraylist3.add("Berlin");
        arraylist3.add("Tel-Aviv");
        arraylist3.add("New-York");
        arraylist3.add("Paris");
        arraylist3.add("London");
        arraylist3.add("Rom");
        arraylist3.add("Madrid");
        arraylist3.add("Buenos-Aires");
        arraylist3.add("Paris");
        arraylist3.add("London");
        arraylist3.add("Rom");
        System.out.println(arraylist3);

        System.out.println(getUniqueStrings(arraylist3));

        ArrayList<String> arraylist4 = new ArrayList<>();
        arraylist4.add("Птица");
        arraylist4.add("Говорун");
        arraylist4.add("отличается");
        arraylist4.add("умом");
        arraylist4.add("и");
        arraylist4.add("сообразительностью");
        System.out.println(arraylist4);

        System.out.println(getOneString(arraylist4, "/"));
        System.out.println(getOneString(arraylist4, "%"));
        System.out.println(getOneString(arraylist4, "_"));

    }


    public static ArrayList<Integer> getMaxSubsequence(ArrayList<Integer> arrayList) { //возвращает наибольшую возрастающую последовательность элементов
        int currentIndex = 0;
        int currentLength = 1;
        int longestIndex = 0;
        int longestLength = 1;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                currentLength++;
            } else {
                currentIndex = i + 1;
                currentLength = 1;
            }
            if (longestLength < currentLength) {
                longestLength = currentLength;
                longestIndex = currentIndex;
            }
        }
        List<Integer> list = arrayList.subList(longestIndex, longestIndex + longestLength);
        return new ArrayList<>(list);
    }

    public static void deleteDuplicates(ArrayList<Integer> arrayList) {//удаляет все дубликаты элементов
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                }
            }
        }
    }

    public static ArrayList<String> getUniqueStrings(ArrayList<String> arrayList) {//возвращает новый список, содержащий только уникальные строки
        ArrayList<String> arrayList1;
        arrayList1 = (ArrayList)arrayList.clone();
        for (int i = 0; i < arrayList1.size() - 1; i++) {
            for (int j = i + 1; j < arrayList1.size(); j++) {
                if (arrayList1.get(i).equals(arrayList1.get(j))) {
                    arrayList1.remove(j);
                }
            }
        }
        return arrayList1;
    }

    public static String getOneString(ArrayList<String> arrayList, String delimiter) {//объединяет все строки в одну с использованием разделителя
        String oneString = "";
        for (String string : arrayList) {
            oneString += (string + delimiter);
        }
        return oneString;
    }



}

