package org.example.task2a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Loader extends Thread {

    private AtomicInteger boxesOnDock;
    private AtomicBoolean truckIsEmpty;

    public Loader(AtomicInteger boxesOnDock, AtomicBoolean truckIsEmpty) {
        this.boxesOnDock = boxesOnDock;
        this.truckIsEmpty = truckIsEmpty;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (boxesOnDock) {
                if (boxesOnDock.get() < 1) {
                    try {
                        boxesOnDock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    boxesOnDock.decrementAndGet();
                    System.out.println("Loader " + Thread.currentThread().getName() + ": - On the dock - " + boxesOnDock.get());

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
            if(truckIsEmpty.get() && boxesOnDock.get() < 1){
                synchronized (boxesOnDock) {
                    boxesOnDock.notifyAll();
                }
                break;
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Dock is empty - " + boxesOnDock.get());
        System.out.println("Loader " + Thread.currentThread().getName() + " finished");
    }
}

