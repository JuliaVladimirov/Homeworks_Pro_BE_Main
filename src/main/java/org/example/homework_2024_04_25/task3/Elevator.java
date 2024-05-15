package org.example.homework_2024_04_25.task3;

//3**. Для желающих поломать голову, усложним задачу из прошлого домашнего задания:
//Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек
//или он может поднять не более 300 кг. груза. Создайте группу людей, каждый из которых будет иметь
//характеристику вес.
//Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).
//Вес человека можно генерировать, но не более 150 кг. :)

import java.util.concurrent.atomic.AtomicInteger;

public class Elevator implements Runnable {

    private AtomicInteger totalWeight;

    public Elevator(AtomicInteger totalWeight) {
        this.totalWeight = totalWeight;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Лифт поднимается на смотровую площадку\n");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        totalWeight.set(0);
    }
}