package org.example.house;

//       2) Есть класс Дом и в нем живет много объектов типа Житель.
//        У Дома так же есть объекты Крыша, Стены, Окна, Двери.
//        Создайте класс для сущности Дом и ассоциированные с ним объекты, входящий в него.
//        Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.

import java.util.ArrayList;

public class CreateHouse {
    public static void main(String[] args) {
        House house1 = new House(6,"yellow");
        house1.buildHouse();
        System.out.println("-------------------------------------------------------------");

        ArrayList<HouseResident> residents1 = new ArrayList<HouseResident>();
        HouseResident resident1 = new HouseResident("Sam", "father", 35);
        residents1.add(resident1);
        HouseResident resident2 = new HouseResident("Mary", "mother", 30);
        residents1.add(resident2);
        HouseResident resident3 = new HouseResident("Kevin", "son", 12);
        residents1.add(resident3);
        HouseResident resident4 = new HouseResident("Karin", "daughter", 5);
        residents1.add(resident4);
        HouseResident resident5 = new HouseResident("Bill", "grandfather", 55);
        residents1.add(resident5);
        HouseResident resident6 = new HouseResident("Doroty", "grandmother", 52);
        residents1.add(resident6);

        HouseResident[] residents2 = new HouseResident[residents1.size()];
        residents1.toArray(residents2);

        house1.setResident(residents2);
        house1.populateHouse(residents2);
    }
}
