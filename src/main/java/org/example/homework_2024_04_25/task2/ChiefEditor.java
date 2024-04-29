package org.example.homework_2024_04_25.task2;

import java.util.concurrent.Phaser;

public class ChiefEditor extends Thread{

    Phaser phaser;

    String name;

    public ChiefEditor(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        phaser.register();
        System.out.println("Я - " + name + " - читаю произведение");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        phaser.arriveAndDeregister();
    }
}
