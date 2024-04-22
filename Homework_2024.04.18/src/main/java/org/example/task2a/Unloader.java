package org.example.task2a;

import java.util.concurrent.atomic.AtomicInteger;

public class Unloader extends Thread {

    private AtomicInteger boxesInTruck;
    private AtomicInteger boxesOnDock;

    public Unloader(AtomicInteger boxesInTruck, AtomicInteger boxesOnDock) {
        this.boxesInTruck = boxesInTruck;
        this.boxesOnDock = boxesOnDock;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (boxesOnDock) {
                if (boxesOnDock.get() > 1) {
                    try {
                        boxesOnDock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    boxesOnDock.incrementAndGet();
                    boxesInTruck.decrementAndGet();
                    System.out.println("Unloader - On the dock - " + boxesOnDock.get());
                    System.out.println("Unloader - In the truck - " + boxesInTruck.get());

                    boxesOnDock.notifyAll();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (boxesOnDock) {
            if (boxesInTruck.get() < 1) {
                    boxesOnDock.notifyAll();
                    break;
                }
            }
        }
        System.out.println("Unloader " + Thread.currentThread().getName() + ": Truck is empty - " + boxesInTruck.get());
        System.out.println("Unloader " + Thread.currentThread().getName() + " finished");
    }
}

