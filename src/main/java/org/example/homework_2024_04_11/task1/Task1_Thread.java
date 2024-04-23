package org.example.homework_2024_04_11.task1;

public class Task1_Thread extends Thread {

//  1. Запустите в три потока просчет суммы всех чисел, который без остатка делятся на 17
//  в интервале от 0 до 10 млн. Показывайте на экран, как будет накапливаться сумма по каждому потоку.
//  После запуска просчета, главный поток остановите на 1 секунду и завершите его.
//  Все дочерние потоки должны автоматически закрыться.

    private int divider;
    private int range;

    private int counter = 0;

    public Task1_Thread() {
    }

    public Task1_Thread(int divider, int range) {
        this.divider = divider;
        this.range = range;
    }

    public void run() {
        for (int i = 0; i <= range; i++) {
            if (i % divider == 0) {
                counter = counter + i;
                System.out.println(Thread.currentThread().getName() + " : " + counter);
            }
        }
    }
}
