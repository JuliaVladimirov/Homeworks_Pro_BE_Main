package org.example.homework_2024_04_25.task1;

//1. Кассир в магазине. К нему подходят клиенты с товарам отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
//сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Cashier extends Thread {

    private int change;
    private AtomicInteger totalSum;
    Exchanger<Integer> exchanger;
    AtomicBoolean noMoreCustomers;

    public Cashier(Exchanger<Integer> exchanger, AtomicInteger totalSum, AtomicBoolean noMoreCustomers) {
        this.exchanger = exchanger;
        this.totalSum = totalSum;
        this.noMoreCustomers = noMoreCustomers;


    }

    @Override
    public void run() {

        while(!noMoreCustomers.get()) {
            int payment;
            try {
                payment = exchanger.exchange(null);
                System.out.println("Кассир " + Thread.currentThread().getName() + " получил оплату " + payment);

                Random random = new Random();
                change = random.nextInt(payment);
                exchanger.exchange(change);

                totalSum.set(totalSum.get() + payment - change);

                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Кассир закончил работу");
    }
}


