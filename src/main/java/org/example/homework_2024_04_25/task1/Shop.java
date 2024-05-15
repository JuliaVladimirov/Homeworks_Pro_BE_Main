package org.example.homework_2024_04_25.task1;

//1. Кассир в магазине. К нему подходят клиенты с товаром отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
//сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger totalSum = new AtomicInteger(0);
        Exchanger<Integer> exchanger = new Exchanger<>();
        AtomicBoolean noMoreCustomers = new AtomicBoolean(false);

        Cashier cashier = new Cashier(exchanger, totalSum, noMoreCustomers);
        cashier.start();
        for (int i = 0; i < 5; i++) {

            Customer customer = new Customer(exchanger);
            customer.start();
            Thread.sleep(500);
            customer.join();
        }

        noMoreCustomers.set(true);

        System.out.println("Не осталось ни одного покупателя: " + noMoreCustomers.get());
        System.out.println("Дневная выручка: " + totalSum);
    }
}

