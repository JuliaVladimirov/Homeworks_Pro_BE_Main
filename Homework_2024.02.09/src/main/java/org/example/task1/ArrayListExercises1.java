package org.example.task1;

import java.util.ArrayList;

//         1)
//         Найти сумму всех элементов ArrayList.
//         Перебрать ArrayList и вывести все элементы на экран.
//         Создать ArrayList с объектами вашего собственного класса и вывести их на экран.


public class ArrayListExercises1 {
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

        System.out.println("The sum of all elements of the arraylist is: " + getArrayListSum(arraylist1));

//------------------------------------------------------------------------------------------------

        getAllElements(arraylist1);

//------------------------------------------------------------------------------------------------

        ArrayList <Person> arraylist2 = new ArrayList<>();
        Person person1 = new Person("Tom", "Smith", 35);
        arraylist2.add(person1);
        Person person2 = new Person("Bill", "Green", 27);
        arraylist2.add(person2);
        Person person3 = new Person("John", "Brown", 44);
        arraylist2.add(person3);
        Person person4 = new Person("Mary", "Anderson", 52);
        arraylist2.add(person4);
        Person person5 = new Person("Lily", "Miller", 29);
        arraylist2.add(person5);
        System.out.println(arraylist2);




    }


    public static int getArrayListSum (ArrayList<Integer> arrayList){ // возвращает сумму всех элементов
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    public static void getAllElements (ArrayList<Integer> arrayList){ // выводит все элементы на экран
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }


}


