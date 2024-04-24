package org.example.homework_2024_04_23.task3;

//  3*. Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек.
//  Создайте группу людей, каждый из которых будет иметь характеристику вес.
//  Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

public class ObservationDeck {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количестве людей в группе");
        int groupSize = scanner.nextInt();

        Elevator elevator = new Elevator();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, elevator);


        for (int i = 0; i < groupSize; i++) {
            Random random = new Random();
            int weight = random.nextInt(50,100);
            new Person(weight, cyclicBarrier, elevator).start();
            Thread.sleep(500);
        }
    }
}
