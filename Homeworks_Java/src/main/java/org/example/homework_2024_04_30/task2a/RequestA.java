package org.example.homework_2024_04_30.task2a;

import java.time.LocalTime;
public class RequestA implements Runnable {


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + ": Соединение установлено");
        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время: " + localTime);

    }
}
