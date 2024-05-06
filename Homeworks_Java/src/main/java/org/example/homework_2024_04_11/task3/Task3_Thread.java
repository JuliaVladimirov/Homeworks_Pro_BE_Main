package org.example.homework_2024_04_11.task3;

public class Task3_Thread extends Thread{

//  3*. Запустите в 3 потока просчет количества всех простых чисел в интервале от 2 до 1_000_000.
//  Через 5 секунд завершите принудительно выполнение 1-го потока командой из главного.
//  Через 10 секунд завершите и 2-й поток.
//  Через 15 секунд - 3-й поток.
//  Время подкорректируйте под скорость своего компьютера.

    private int start;
    private int end;

    public Task3_Thread(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " начал работу");
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean isPrime = true;

            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }

            if (isInterrupted()){
                long endTime = System.currentTimeMillis();
                long currentTimeResult = endTime - startTime;
                System.out.println(Thread.currentThread().getName() + " завершил работу за " + currentTimeResult + "миллисекунд.");
                return;
            }
        }


    }
}
