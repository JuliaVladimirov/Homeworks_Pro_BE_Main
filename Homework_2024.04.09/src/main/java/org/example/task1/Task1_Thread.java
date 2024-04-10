package org.example.task1;

public class Task1_Thread extends Thread {

//  1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
//  введенной цифре, нумеруете их и запускаете на выполнение.
//  Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 миллисекунд перед каждым выводом.
//  Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.

    private int howManyTimes;
    private int range;

    public Task1_Thread() {
    }

    public Task1_Thread(int howManyTimes, int range) {
        this.howManyTimes = howManyTimes;
        this.range = range;
    }

    public void run() {
        for (int i = 1; i <= this.howManyTimes; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(range);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




