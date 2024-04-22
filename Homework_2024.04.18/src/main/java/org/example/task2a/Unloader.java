package org.example.task2a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Unloader extends Thread {

    private AtomicInteger boxesInTruck;
    private AtomicInteger boxesOnDock;
    private AtomicBoolean truckIsEmpty;

    public Unloader(AtomicInteger boxesInTruck,AtomicInteger boxesOnDock, AtomicBoolean truckIsEmpty) {
        this.boxesInTruck = boxesInTruck;
        this.boxesOnDock = boxesOnDock;
        this.truckIsEmpty = truckIsEmpty;
    }



    @Override
    public void run() {
        while (boxesInTruck.get() > 0) {
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

                    synchronized (boxesOnDock) {
                        boxesOnDock.notifyAll();
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Unloader " + Thread.currentThread().getName() + ": Truck is empty - " + boxesInTruck.get());
        truckIsEmpty.set(true);
        System.out.println("Unloader " + Thread.currentThread().getName() + " finished");
    }
}

