package org.example.homework_2024_01_16.task1;

public class PersonConstruction {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person ("Mike Green", 45);
        person2.move();
        person2.talk();
    }
}

// 1. Класс Person
//
// Создать класс Person, который содержит:
// переменные fullName, age;
// методы move() и talk(), в которых просто вывести на консоль сообщение -
// "Такой-то Person говорит".
//
// Добавьте два конструктора -
// Person() и
// Person(fullName, age).
//
// Создайте два объекта этого класса.
// Один объект инициализируется конструктором Person(),
// другой - Person(fullName, age)

