package org.example.homework_2024_04_25.task3;

//3**. Для желающих поломать голову, усложним задачу из прошлого домашнего задания:
//Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек
//или он может поднять не более 300 кг. груза. Создайте группу людей, каждый из которых будет иметь
//характеристику вес.
//Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).
//Вес человека можно генерировать, но не более 150 кг. :)

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Person extends Thread {
    private int weight;
    private CyclicBarrier cyclicBarrier;
    private Elevator elevator;

    public Person(int weight, CyclicBarrier cyclicBarrier, Elevator elevator) {
        this.weight = weight;
        this.cyclicBarrier = cyclicBarrier;
        this.elevator = elevator;

    }

    @Override
    public void run() {


        System.out.println("Пассажир зашел в лифт (" + weight + " кг)");
        try {
            cyclicBarrier.await(4000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException  | BrokenBarrierException ignore) {

        } catch (TimeoutException e) {
            System.out.println("Лифт не полный, но пассажиров больше нет");
            elevator.run();

        }
    }
}
