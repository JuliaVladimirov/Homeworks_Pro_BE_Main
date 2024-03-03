package org.example.task2;

//    2)    У вас есть приют для животных, в которых живут коты.
//          Есть объект Cat с данными: имя, возраст, вес, порода.

//          - создайте Map, ключом которого будет имя, а значением объект Cat.
//          - информация о котах должна храниться в упорядоченном виде по имени.
//          - выведите имена котов, порода которых равна N (на ваше усмотрение).
//          - выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//          - * найдите кота с самым большим весом и возрастом одновременно.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 7, 8, "Persian");
        Cat cat2 = new Cat("Lilly", 2, 5, "Siamese");
        Cat cat3 = new Cat("Sally", 4, 8, "Sphinx");
        Cat cat4 = new Cat("Misty", 3, 4, "Egyptian");
        Cat cat5 = new Cat("Poppy", 7, 6, "Abyssinian");
        Cat cat6 = new Cat("Bella", 6, 5, "Abyssinian");
        Cat cat7 = new Cat("Clara", 3, 7, "Abyssinian");


        Map<String, Cat> animalShelter = new TreeMap<>();
        animalShelter.put(cat1.getName(), cat1);
        animalShelter.put(cat2.getName(), cat2);
        animalShelter.put(cat3.getName(), cat3);
        animalShelter.put(cat4.getName(), cat4);
        animalShelter.put(cat5.getName(), cat5);
        animalShelter.put(cat6.getName(), cat6);
        animalShelter.put(cat7.getName(), cat7);

        System.out.println("Animal Shelter:");
        System.out.println(animalShelter);
        System.out.println();

        System.out.println("Abyssinian Breed:");
        System.out.println(getNamesByBreed(animalShelter));
        System.out.println();

        System.out.println("Cats < 6 kg:");
        System.out.println(getCatsByWeight(animalShelter));
        System.out.println();

        System.out.println("The fattest and oldest cat:");
        System.out.println(getMaxWeightAndAge(animalShelter));
    }

    public static List<String> getNamesByBreed(Map<String, Cat> animalShelter) {
        List<String> animalNamesList = new ArrayList<>();
        for (Map.Entry<String, Cat> entry : animalShelter.entrySet()) {
            if (entry.getValue().getBreed().equals("Abyssinian")) {
                animalNamesList.add(entry.getKey());
            }
        }
        return animalNamesList;
    }

    public static List<Map.Entry<String, Cat>> getCatsByWeight(Map<String, Cat> animalShelter) {
        List<Map.Entry<String, Cat>> animalNamesList = new ArrayList<>();
        for (Map.Entry<String, Cat> entry : animalShelter.entrySet()) {
            if (entry.getValue().getWeight() < 6) {
                animalNamesList.add(entry);
            }
        }
        return animalNamesList;
    }

    public static Map.Entry<String, Cat> getMaxWeightAndAge(Map<String, Cat> animalShelter) {
        List<Map.Entry<String, Cat>> catsList = new ArrayList<>(animalShelter.entrySet());
        Collections.sort(catsList, new Comparator<Map.Entry<String, Cat>>() {

            public int compare(Map.Entry<String, Cat> entry1, Map.Entry<String, Cat> entry2) {
                if (entry1.getValue().getWeight() == entry2.getValue().getWeight()) {
                    return 0;
                } else if (entry1.getValue().getWeight() > entry2.getValue().getWeight()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        List<Map.Entry<String, Cat>> sameWeightList = new ArrayList();
        Map.Entry<String, Cat> temp = catsList.get(0);

        for (int i = 1; i < catsList.size(); i++) {
            if (temp.getValue().getWeight() == (catsList.get(i).getValue().getWeight())) {
                sameWeightList.add(catsList.get(i));
            }
        }
        sameWeightList.add(temp);

        Collections.sort(sameWeightList, new Comparator<Map.Entry<String, Cat>>() {
            public int compare(Map.Entry<String, Cat> entry1, Map.Entry<String, Cat> entry2) {
                if (entry1.getValue().getAge() == entry2.getValue().getAge()) {
                    return 0;
                } else if (entry1.getValue().getAge() > entry2.getValue().getAge()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return sameWeightList.get(0);
    }
}
