package org.example.homework_2024_04_25.task1;

//1. Кассир в магазине. К нему подходят клиенты с товарам отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
//сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

import java.util.Random;
import java.util.concurrent.Exchanger;

public class Customer extends Thread {

    private int payment;
    Exchanger<Integer> exchanger;

    public Customer(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        Random random = new Random();
        payment = random.nextInt(500);
        try {
            exchanger.exchange(payment);
            Thread.sleep(500);
            int change = exchanger.exchange(payment);
            System.out.println("Покупатель " + Thread.currentThread().getName() + " получил сдачу " + change);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
