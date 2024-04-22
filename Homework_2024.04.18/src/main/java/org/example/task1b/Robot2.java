package org.example.task1b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Robot2 extends Thread {

    AtomicInteger part;

    private AtomicBoolean startWorking;

    public Robot2(AtomicInteger part, AtomicBoolean startWorking) {
        this.part = part;
        this.startWorking = startWorking;

    }

    @Override
    public void run() {
        System.out.println("Робот2 стартовал");
        int counter = 1;
        while (startWorking.get()) {
            synchronized (part) {
                try {
                    if (part.get() <= 0) {
                        part.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Робот2 взял деталь" + counter++);
            part.decrementAndGet();
            synchronized (part) {
                part.notify();
            }
        }

        System.out.println("Робот2 закончил работу");
    }
}



