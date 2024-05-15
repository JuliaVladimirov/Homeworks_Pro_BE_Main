package org.example.homework_2024_04_18.task2b;

import java.util.Stack;

public class Unloader extends Thread {

    private Stack<Box> boxesInTruck;
    private Stack<Box> boxesOnDock;

    public Unloader(Stack<Box> boxesInTruck, Stack<Box> boxesOnDock) {
        this.boxesInTruck = boxesInTruck;
        this.boxesOnDock = boxesOnDock;
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
            synchronized (boxesOnDock) {
                if (boxesInTruck.isEmpty()) {
                    boxesOnDock.notifyAll();
                    break;
                }
            }

        }
        System.out.println("Unloader " + Thread.currentThread().getName() + ": Truck is empty - " + boxesInTruck.isEmpty());
        System.out.println("Unloader " + Thread.currentThread().getName() + " finished");
    }
}

