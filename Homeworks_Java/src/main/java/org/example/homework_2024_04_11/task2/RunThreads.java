package org.example.homework_2024_04_11.task2;

import java.util.Scanner;

public class RunThreads {

//  2*. Создайте 2 потока (1 - Курица, 2 - Яйцо).
//  Первый будет постоянно выводить слово "Курица" и останавливаться на 1 сек.
//  Второй будет постоянно выводить слово "Яйцо" и тоже останавливаться на 1 сек.
//  Главный поток выводит на экран сообщение "Кто же первый?" и запускает оба дочерних потока.
//  Потом главный поток спрашивает у пользователя: "Кто же прав?"
//  Если пользователь вводит 1, главный поток выключает поток, который выводит "Яйцо".
//  Если вводит 2, главный поток выключает дочерний поток, который выводит "Курица".
//  Иначе выключает оба потока и возвращает фразу "Как же вы надоели!".

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Chicken_Thread chickenThread = new Chicken_Thread();
        Egg_Thread eggThread = new Egg_Thread();

        System.out.println("Кто же первый?");
        chickenThread.start();
        eggThread.start();

        Thread.sleep(3000);
        chickenThread.setPaused(true);
        eggThread.setPaused(true);
        Thread.sleep(3000);

        System.out.println("Кто же прав?");
        int choice = scanner.nextInt();

        chickenThread.setPaused(false);
        eggThread.setPaused(false);
        Thread.sleep(3000);

        if (choice == 1) {
            eggThread.interrupt();
        } else if (choice == 2) {
            chickenThread.interrupt();
        } else {
            eggThread.interrupt();
            chickenThread.interrupt();
            System.out.println("Как же вы надоели!");
        }
    }
}
