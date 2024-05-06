package org.example.homework_2024_04_09.task3;

public class Task3_Thread extends Thread {

//  3**. В классе писали задачу для поиска всех простых числа в диапазоне до 1 000 000.
//  Напишите программу, запустив которую вы сможете определить оптимальное количество
//  создаваемых потоков для выполнения этой задачи на текущем компьютере.
//  Используйте общее время выполнения программы при обработке всего диапазона чисел
//  для расчета оптимального количества созданных потоков.

    private int start;
    private int end;

    public Task3_Thread(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public void run() {
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
        }
    }

}
