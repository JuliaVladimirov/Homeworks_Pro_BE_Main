package module_1.lecture_1.module_1.lecture_1;

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

// 1. Класс module_1.lecture_1.module_1.lecture_1.Person
//
// Создать класс module_1.lecture_1.module_1.lecture_1.Person, который содержит:
// переменные fullName, age;
// методы move() и talk(), в которых просто вывести на консоль сообщение -
// "Такой-то  module_1.lecture_1.module_1.lecture_1.Person говорит".
//
// Добавьте два конструктора -
// module_1.lecture_1.module_1.lecture_1.Person() и
// module_1.lecture_1.module_1.lecture_1.Person(fullName, age).
//
// Создайте два объекта этого класса.
// Один объект инициализируется конструктором module_1.lecture_1.module_1.lecture_1.Person(),
// другой - module_1.lecture_1.module_1.lecture_1.Person(fullName, age)
//
