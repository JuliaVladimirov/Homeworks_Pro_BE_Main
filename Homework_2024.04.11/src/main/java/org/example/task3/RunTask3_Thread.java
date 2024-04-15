package org.example.task3;

public class RunTask3_Thread {

//  3*. Запустите в 3 потока просчет количества всех простых чисел в интервале от 2 до 1_000_000.
//  Через 5 секунд завершите принудительно выполнение 1-го потока командой из главного.
//  Через 10 секунд завершите и 2-й поток.
//  Через 15 секунд - 3-й поток.
//  Время подкорректируйте под скорость своего компьютера.


    public static void main(String[] args) {

//  В задаче не совсем понятно, от чего нужно рассчитывать время каждого потока,
//  от точки старта всех потоков или каждый следующий поток от точки прерывания предыдущего?

// Подкорректировать время тоже проблематично, оно каждый раз разное, на чуть-чуть, но разное....

        Task3_Thread thread1 = new Task3_Thread(2, 1_000_000);
        Task3_Thread thread2 = new Task3_Thread(2, 1_000_000);
        Task3_Thread thread3 = new Task3_Thread(2, 1_000_000);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.interrupt();

        try {
            Thread.sleep(10000);// или Thread.sleep(5000), если считать все потоки от точки старта
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.interrupt();

        try {
            Thread.sleep(15000);// или Thread.sleep(5000), если считать все потоки от точки старта
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.interrupt();
    }

}
