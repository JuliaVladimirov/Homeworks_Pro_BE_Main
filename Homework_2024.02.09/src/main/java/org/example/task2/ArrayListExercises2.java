package org.example.task2;

import java.util.ArrayList;

//         2)
//         Перебрать ArrayList и найти наименьший элемент.
//         Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//         Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.


public class ArrayListExercises2 {
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

        System.out.println("The min element is: " + getMinElement(arraylist1));

//------------------------------------------------------------------------------------------------

        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("Moscow");
        arraylist2.add("Berlin");
        arraylist2.add("Tel-Aviv");
        arraylist2.add("New-York");
        arraylist2.add("Paris");
        arraylist2.add("London");
        arraylist2.add("Rom");
        arraylist2.add("Madrid");
        arraylist2.add("Buenos-Aires");
        System.out.println(arraylist2);

        char letter = 'b';
        System.out.println("Words that start with letter '" + letter + "': " + countCertainElements(arraylist2, letter));

        char letter1 = 'l';
        System.out.println("Words that start with letter '" + letter1 + "': " + countCertainElements(arraylist2, letter1));

//-----------------------------------------------------------------------------------------------


        ArrayList<Product> arraylist3 = new ArrayList<>();
        Product product1 = new Product("TV", 650, true);
        arraylist3.add(product1);
        Product product2 = new Product("Washing Machine", 550, true);
        arraylist3.add(product2);
        Product product3 = new Product("Fridge", 750, false);
        arraylist3.add(product3);
        Product product4 = new Product("Electric Oven", 600, true);
        arraylist3.add(product4);
        Product product5 = new Product("Cooking Stove", 450, false);
        arraylist3.add(product5);
        System.out.println(arraylist3);

        deleteElementsByPrice(arraylist3);
        System.out.println(arraylist3);

    }


    public static int getMinElement(ArrayList<Integer> arrayList) { // возвращает наименьший элемент - первый вариант с перебором
        int minElement = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (minElement > arrayList.get(i)) {
                minElement = arrayList.get(i);
            }
        }
        return minElement;
    }

//    public static Integer getMinElement(ArrayList<Integer> arrayList) { // второй вариант - проще и быстрее
//        Collections.sort(arrayList);
//        return arrayList.get(0);
//    }

    public static int countCertainElements(ArrayList<String> arrayList, char letter) { // считает количество элементов, начинающихся с определенной буквы.
        int count = 0;
        for (String word : arrayList) {
            if (word.toLowerCase().charAt(0) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void deleteElementsByPrice(ArrayList<Product> arrayList) { //удаляет продукты, которых нет в наличии
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).isInStock()) {
                arrayList.remove(i);
            }
        }
    }

}

