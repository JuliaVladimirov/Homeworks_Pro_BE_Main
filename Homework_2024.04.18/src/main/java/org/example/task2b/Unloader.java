package org.example.task2b;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class Unloader extends Thread {

    private Stack<Box> boxesInTruck;
    private Stack<Box> boxesOnDock;
    private AtomicBoolean truckIsEmpty;

    public Unloader(Stack<Box> boxesInTruck, Stack<Box> boxesOnDock, AtomicBoolean truckIsEmpty) {
        this.boxesInTruck = boxesInTruck;
        this.boxesOnDock = boxesOnDock;
        this.truckIsEmpty = truckIsEmpty;
    }

    public Stack<Box> getBoxesInTruck() {
        return boxesInTruck;
    }

    public Stack<Box> getBoxesOnDock() {
        return boxesOnDock;
    }

    public AtomicBoolean getTruckIsEmpty() {
        return truckIsEmpty;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (boxesOnDock) {
                if (boxesOnDock.size() > 1) {
                    try {
                        boxesOnDock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {

                    boxesOnDock.push(boxesInTruck.pop());
                    System.out.println("Unloader - On the dock - " + boxesOnDock.size());
                    System.out.println("Unloader - In the truck - " + boxesInTruck.size());

                    boxesOnDock.notifyAll();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (boxesInTruck.isEmpty()) {
                synchronized (boxesOnDock) {
                    boxesOnDock.notifyAll();
                }
                break;
            }

        }
        System.out.println("Unloader " + Thread.currentThread().getName() + ": Truck is empty - " + boxesInTruck.isEmpty());
        truckIsEmpty.set(true);
        System.out.println("Unloader " + Thread.currentThread().getName() + " finished");
    }
}

