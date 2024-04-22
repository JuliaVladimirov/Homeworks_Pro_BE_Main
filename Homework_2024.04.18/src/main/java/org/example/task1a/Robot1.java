package org.example.task1a;

import java.util.concurrent.atomic.AtomicInteger;

public class Robot1 extends Thread {

    AtomicInteger part;

    private int counter;

    public Robot1(AtomicInteger part, int counter) {
        this.part = part;
        this.counter = counter;

    }

    @Override
    public void run() {
        System.out.println("Робот1 стартовал.");
        for (int i = 1; i <= counter ; i++) {
            synchronized (part) {
                try {
                    if (part.get() > 0) {
                        part.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Робот1 положил деталь" + i +".");
            part.incrementAndGet();
            synchronized (part) {
                part.notify();
            }
        }

        System.out.println("Робот1 закончил работу.");
    }
}

