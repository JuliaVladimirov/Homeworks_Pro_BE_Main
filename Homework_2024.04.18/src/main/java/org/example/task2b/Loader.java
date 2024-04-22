package org.example.task2b;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class Loader extends Thread {

    private Stack<Box> boxesOnDock;
    private AtomicBoolean truckIsEmpty;

    public Loader(Stack<Box> boxesOnDock, AtomicBoolean truckIsEmpty) {
        this.boxesOnDock = boxesOnDock;
        this.truckIsEmpty = truckIsEmpty;

    }
    public Stack<Box> getBoxesOnDock() {
        return boxesOnDock;
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
            if(truckIsEmpty.get() && boxesOnDock.isEmpty()){
                synchronized (boxesOnDock) {
                    boxesOnDock.notifyAll();
                }
                break;
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Dock is empty - " + boxesOnDock.isEmpty());
        System.out.println("Loader " + Thread.currentThread().getName() + " finished");
    }
}

