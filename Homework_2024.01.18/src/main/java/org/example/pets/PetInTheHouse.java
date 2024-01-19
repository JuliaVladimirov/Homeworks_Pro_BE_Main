package org.example.pets;

public class PetInTheHouse {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Hamster", "Hammy", "braun", 4, "seeds", "a box", "squeak", 2);
        pet1.run();
        pet1.eat();
        pet1.sleep();
        pet1.makeSound();
        pet1.hear();

        System.out.println("--------------------------------------------------");

        Dog dog1 = new Dog("Dog", "Lucy", "golden", 4, "sausage", "a mat", "woof, woof", 2, 1, "newsletter");
        dog1.run();
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();
        dog1.hear();
        dog1.wagTheTail();//этот метод есть только у класса Dog
        dog1.bringToOwner();//этот метод есть только у класса Dog

        System.out.println("--------------------------------------------------");

        Dog dog2 = new Dog("Dog", "Buddy", "braun", 4, "dog food", "a sofa", "woof, woof", 2, 1, "slippers");
        dog2.run();
        dog2.eat();
        dog2.sleep();
        dog2.makeSound();
        dog2.hear();
        dog2.wagTheTail();//этот метод есть только у класса Dog
        dog2.bringToOwner();//этот метод есть только у класса Dog

        System.out.println("--------------------------------------------------");

        Cat cat1 = new Cat("Cat", "Tilly", "black", 4, "fish", "a basket", "meow-meow", 2, 2, "a mouse");
        cat1.run();
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
        cat1.hear();
        cat1.seeInTheDark();//этот метод есть только у класса Cat
        cat1.hunt();//этот метод есть только у класса Cat

        System.out.println("--------------------------------------------------");

        Cat cat2 = new Cat("Cat", "Fluffy", "white", 4, "cat food", "a bed", "meow-meow", 2, 2, "a bird");
        cat2.run();
        cat2.eat();
        cat2.sleep();
        cat2.makeSound();
        cat2.hear();
        cat2.seeInTheDark();//этот метод есть только у класса Cat
        cat2.hunt();//этот метод есть только у класса Cat
    }
}

// 1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
//и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
//общие, а какие проявляются только у конкретного типа.
//

