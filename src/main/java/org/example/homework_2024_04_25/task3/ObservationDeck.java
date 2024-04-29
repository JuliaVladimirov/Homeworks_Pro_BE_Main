package org.example.homework_2024_04_25.task3;

//3**. Для желающих поломать голову, усложним задачу из прошлого домашнего задания:
//Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек
//или он может поднять не более 300 кг. груза. Создайте группу людей, каждый из которых будет иметь
//характеристику вес.
//Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).
//Вес человека можно генерировать, но не более 150 кг. :)

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;


public class ObservationDeck {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количестве людей в группе");
        int groupSize = scanner.nextInt();

        System.out.println("Введите грузоподъемность лифта");
        int elevatorCapacity = scanner.nextInt();
        AtomicInteger totalWeight = new AtomicInteger(0);
        Elevator elevator = new Elevator(totalWeight);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, elevator);

        for (int i = 0; i < groupSize; i++) {

            Random random = new Random();
            int weight = random.nextInt(20, 150);
            totalWeight.set(totalWeight.get() + weight);

            if (totalWeight.get() < elevatorCapacity) {
                new Person(weight, cyclicBarrier, elevator).start();
            } else {
                System.out.println("Лифт не может взять больше людей");
                System.out.println("В лифте уже: " + (totalWeight.get() - weight) + " кг");
                System.out.println("Еще один пассажир весит : " + weight + " кг");

                cyclicBarrier.reset();
                elevator.start();
                elevator = new Elevator(totalWeight);
                cyclicBarrier = new CyclicBarrier(5, elevator);

                i--;
            }
            Thread.sleep(500);
        }
    }
}

