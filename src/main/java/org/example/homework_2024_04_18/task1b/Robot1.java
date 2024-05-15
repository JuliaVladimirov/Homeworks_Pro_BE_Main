package org.example.homework_2024_04_18.task1b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Robot1 extends Thread {

    AtomicInteger part;

    private AtomicBoolean startWorking;

    public Robot1(AtomicInteger part, AtomicBoolean startWorking) {
        this.part = part;
        this.startWorking = startWorking;

    }

    @Override
    public void run() {
        System.out.println("Робот1 стартовал");
        int counter = 1;
        while (startWorking.get()) {
            synchronized (part) {
                try {
                    if (part.get() > 0) {
                        part.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Робот1 положил деталь" + counter++);
            part.incrementAndGet();
            synchronized (part) {
                part.notify();
            }
        }

        System.out.println("Робот1 закончил работу");
    }
}

