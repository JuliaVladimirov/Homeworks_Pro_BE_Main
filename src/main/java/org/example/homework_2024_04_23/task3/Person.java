package org.example.homework_2024_04_23.task3;

//  3*. Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек.
//  Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Person extends Thread {
    private CyclicBarrier cyclicBarrier;
    private Elevator elevator;

    public Person(CyclicBarrier cyclicBarrier, Elevator elevator) {
        this.cyclicBarrier = cyclicBarrier;
        this.elevator = elevator;

    }

    @Override
    public void run() {


        System.out.println(Thread.currentThread().getName() + " зашел в лифт");
        try {
            cyclicBarrier.await(4000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | BrokenBarrierException ignore) {

        } catch (TimeoutException e) {
            System.out.println("Лифт не полный");
            elevator.start();
        }
    }
}
