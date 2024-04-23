package org.example.homework_2024_04_18.task2a;

import java.util.concurrent.atomic.AtomicInteger;

public class Loader extends Thread {

    private AtomicInteger boxesOnDock;
    private AtomicInteger boxesInTruck;

    public Loader(AtomicInteger boxesOnDock, AtomicInteger boxesInTruck) {
        this.boxesOnDock = boxesOnDock;
        this.boxesInTruck = boxesInTruck;
    }

    @Override
    public void run() {
        while (true) {
            if (boxesOnDock.get() < 1) {
                synchronized (boxesOnDock) {
                    try {
                        boxesOnDock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                boxesOnDock.decrementAndGet();
                System.out.println("Loader " + Thread.currentThread().getName() + ": - On the dock - " + boxesOnDock.get());

                synchronized (boxesOnDock) {
                    boxesOnDock.notifyAll();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (boxesInTruck.get() < 1 && boxesOnDock.get() < 1) {
                synchronized (boxesOnDock) {
                    boxesOnDock.notifyAll();
                }
                break;
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Dock is empty - " + boxesOnDock.get() + ", Truck is empty - " + boxesInTruck.get());
        System.out.println("Loader " + Thread.currentThread().getName() + " finished");
    }
}

