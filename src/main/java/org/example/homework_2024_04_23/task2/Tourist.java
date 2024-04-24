package org.example.homework_2024_04_23.task2;

import java.util.concurrent.CountDownLatch;

public class Tourist extends Thread {
    private String touristName;
    private CountDownLatch countDownLatch;

    public Tourist(String touristName, CountDownLatch countDownLatch) {
        this.touristName = touristName;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Моя фамилия: " + touristName);
            countDownLatch.countDown();

            System.out.println(touristName + " ждёт в автобусе.");
            countDownLatch.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
