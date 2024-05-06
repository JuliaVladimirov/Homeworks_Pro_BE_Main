package org.example.homework_2024_04_18.task1a;

import java.util.concurrent.atomic.AtomicInteger;

public class Robot2 extends Thread {

    AtomicInteger part;

    private int counter;

    public Robot2(AtomicInteger part, int counter) {
        this.part = part;
        this.counter = counter;

    }

    @Override
    public void run() {
        System.out.println("Робот2 стартовал.");
        for (int i = 1; i <= counter ; i++) {
            synchronized (part) {
                try {
                    if (part.get() <= 0) {
                        part.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Робот2 взял деталь" + i +".");
            part.decrementAndGet();
            synchronized (part) {
                part.notify();
            }
        }

        System.out.println("Робот2 закончил работу.");
    }
}



