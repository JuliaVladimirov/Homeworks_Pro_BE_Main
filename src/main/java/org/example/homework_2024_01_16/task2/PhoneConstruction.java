package org.example.homework_2024_01_16.task2;

public class PhoneConstruction {
    public static void main(String[] args) {

        Phone phone1 = new Phone(1528756, "Samsung", 200);
        phone1.receiveCall("John");
        System.out.println("The number of this phone is " + phone1.getNumber());

        Phone phone2 = new Phone(5478912, "Xiaomi", 230);
        phone1.receiveCall("Mary");
        System.out.println("The number of this phone is " + phone2.getNumber());

        Phone phone3 = new Phone(3279485, "Google Pixel", 250);
        phone1.receiveCall("Tom");
        System.out.println("The number of this phone is " + phone3.getNumber());
    }
}

//2. Класс Phone.
// Создайте класс Phone, который содержит переменные number, model и weight.
// Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных.
// Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
