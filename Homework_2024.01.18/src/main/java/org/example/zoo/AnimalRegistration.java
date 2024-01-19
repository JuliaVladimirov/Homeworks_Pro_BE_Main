package org.example.zoo;

public class AnimalRegistration {
    public static void main(String[] args) {

        Predators lion = new Predators(1, "Lion", 4, 0, "meat");
        lion.describeAnimal();
        lion.eat();
        lion.huntAnimals();
        lion.placePredators();

        System.out.println("---------------------------------------------");

        Primates chimpanzee = new Primates(3, "Chimpanzee", 4, 0, "bananas");
        chimpanzee.describeAnimal();
        chimpanzee.eat();
        chimpanzee.swingVine();
        chimpanzee.placePrimates();

        System.out.println("---------------------------------------------");

        Horses zebra = new Horses(2, "Zebra", 4, 0, "grass");
        zebra.describeAnimal();
        zebra.eat();
        zebra.gallop();
        zebra.getPlaceInZoo();

        System.out.println("---------------------------------------------");

        MarineAnimals dolphin = new MarineAnimals(4, "Dolphin", 0, 0, "fish");
        dolphin.describeAnimal();
        dolphin.eat();
        dolphin.swim();
        dolphin.placeMarineAnimals();

        System.out.println("---------------------------------------------");

        Birds eagle = new Birds(5, "Eagle", 2, 2, "mice");
        eagle.describeAnimal();
        eagle.eat();
        eagle.fly();
        eagle.placeBirds();

        System.out.println("---------------------------------------------");

        Reptiles crocodile = new Reptiles(1, "Crocodile", 4, 0, "meat");
        crocodile.describeAnimal();
        crocodile.eat();
        crocodile.layEggs();
        crocodile.placeReptiles();

        System.out.println("---------------------------------------------");

        int sum = lion.getNumOfAnimals() + chimpanzee.getNumOfAnimals() + zebra.getNumOfAnimals() + dolphin.getNumOfAnimals() + eagle.getNumOfAnimals() + crocodile.getNumOfAnimals();
        System.out.println("In our zoo are " + sum + " animals: ");
        System.out.println(lion.getNumOfAnimals() + " " + lion.getAnimalName());
        System.out.println(chimpanzee.getNumOfAnimals() + " " + chimpanzee.getAnimalName() + "s");
        System.out.println(zebra.getNumOfAnimals() + " " + zebra.getAnimalName() + "s");
        System.out.println(dolphin.getNumOfAnimals() + " " + dolphin.getAnimalName() + "s");
        System.out.println(eagle.getNumOfAnimals() + " " + eagle.getAnimalName() + "s");
        System.out.println(crocodile.getNumOfAnimals() + " " + crocodile.getAnimalName());


    }


}


//2*. Создать классы и схему наследования для задачи учета животных в зоопарке:
//Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
//А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.
//
//