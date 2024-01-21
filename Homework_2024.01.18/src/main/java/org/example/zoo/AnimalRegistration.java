//2*. Создать классы и схему наследования для задачи учета животных в зоопарке:
//Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
//А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.
//
//

package org.example.zoo;
import java.util.ArrayList;

public class AnimalRegistration {
    public static void main(String[] args) {

        ArrayList<Animals> animals = new ArrayList<Animals>();

        Predators lion = new Predators(1, "Lion", 4, 0, "meat");
        lion.describeAnimal();
        lion.eat();
        lion.huntAnimals();
        lion.placePredators();

        animals.add(lion);

        System.out.println("---------------------------------------------");

        Primates chimpanzee = new Primates(3, "Chimpanzee", 4, 0, "bananas");
        chimpanzee.describeAnimal();
        chimpanzee.eat();
        chimpanzee.swingVine();
        chimpanzee.placePrimates();

        animals.add(chimpanzee);

        System.out.println("---------------------------------------------");

        Horses zebra = new Horses(2, "Zebra", 4, 0, "grass");
        zebra.describeAnimal();
        zebra.eat();
        zebra.gallop();
        zebra.placeHorses();

        animals.add(zebra);


        System.out.println("---------------------------------------------");

        MarineAnimals dolphin = new MarineAnimals(4, "Dolphin", 0, 0, "fish");
        dolphin.describeAnimal();
        dolphin.eat();
        dolphin.swim();
        dolphin.placeMarineAnimals();

        animals.add(dolphin);

        System.out.println("---------------------------------------------");

        Birds eagle = new Birds(5, "Eagle", 2, 2, "mice");
        eagle.describeAnimal();
        eagle.eat();
        eagle.fly();
        eagle.placeBirds();

        animals.add(eagle);

        System.out.println("---------------------------------------------");

        Reptiles crocodile = new Reptiles(1, "Crocodile", 4, 0, "meat");
        crocodile.describeAnimal();
        crocodile.eat();
        crocodile.layEggs();
        crocodile.placeReptiles();

        animals.add(crocodile);

        System.out.println("---------------------------------------------");

        System.out.println(animals);

        System.out.println("---------------------------------------------");

        Animals[] animals1 = new Animals[animals.size()];
        animals.toArray(animals1);
        Animals.CountAnimals(animals1);
    }
}
