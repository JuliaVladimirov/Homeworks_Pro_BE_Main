package org.example.homework_2024_04_23.task1;

import java.util.concurrent.Semaphore;

public class Client extends Thread {
    Semaphore semaphore;

    public Client(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Client -" + Thread.currentThread().getName() + " entered the shop");
            Thread.sleep(30_000);
            System.out.println("Client -" + Thread.currentThread().getName() + " leaves");
            semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}

