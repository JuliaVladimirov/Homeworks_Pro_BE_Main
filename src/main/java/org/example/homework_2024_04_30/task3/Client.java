package org.example.homework_2024_04_30.task3;

import java.util.concurrent.Callable;

public class Client implements Callable<Long> {

    public Client() {

    }

    @Override
    public Long call() {
        long startTime = System.currentTimeMillis();

        System.out.println(Thread.currentThread().getName() + ": Клиент вошел в магазин");

        try {
            Thread.sleep(30_000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(Thread.currentThread().getName() + ": Клиент вышел из магазина");

        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ": Время обслуживания одного покупателя: " + (endTime - startTime));
        return (endTime - startTime);
    }

}

