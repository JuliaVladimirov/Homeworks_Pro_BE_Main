package org.example.homework_2024_04_30.task2;

import java.time.LocalTime;
public class Request implements Runnable {

    private int requestNumber;

    public Request(int taskNumber) {
        this.requestNumber = taskNumber;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + ": Запрос - " + requestNumber + " - Соединение установлено");
        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время: " + localTime);

    }
}
