package org.example.task2b;

import java.util.Stack;

public class Loader extends Thread {

    private Stack<Box> boxesOnDock;
    private Stack<Box> boxesInTruck;

    public Loader(Stack<Box> boxesOnDock, Stack<Box> boxesInTruck) {
        this.boxesOnDock = boxesOnDock;
        this.boxesInTruck = boxesInTruck;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (boxesOnDock) {
                if (boxesOnDock.isEmpty()) {
                    try {
                        boxesOnDock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    boxesOnDock.pop();
                    System.out.println("Loader " + Thread.currentThread().getName() + ": - On the dock - " + boxesOnDock.size());

                    boxesOnDock.notifyAll();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (boxesOnDock) {
                if (boxesInTruck.isEmpty() && boxesOnDock.isEmpty()) {
                    boxesOnDock.notifyAll();
                    break;
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Dock is empty - " + boxesOnDock.isEmpty() + ", Truck is empty - " + boxesInTruck.isEmpty());
        System.out.println("Loader " + Thread.currentThread().getName() + " finished");
    }
}

