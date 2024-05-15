package org.example.homework_2024_04_11.task1;

public class RunTask1_Thread {

//  1. Запустите в три потока просчет суммы всех чисел, которые без остатка делятся на 17
//  в интервале от 0 до 10 млн. Показывайте на экран, как будет накапливаться сумма по каждому потоку.
//  После запуска просчета, главный поток остановите на 1 секунду и завершите его.
//  Все дочерние потоки должны автоматически закрыться.

    public static void main(String[] args) throws InterruptedException {
        Task1_Thread thread1 = new Task1_Thread(17, 10_000_000);
        Task1_Thread thread2 = new Task1_Thread(17, 10_000_000);
        Task1_Thread thread3 = new Task1_Thread(17, 10_000_000);
        thread1.setDaemon(true);
        thread1.start();

        thread2.setDaemon(true);
        thread2.start();

        thread3.setDaemon(true);
        thread3.start();

        Thread.sleep(1000);
        System.out.println("Main - закончил работу.");
    }
}
