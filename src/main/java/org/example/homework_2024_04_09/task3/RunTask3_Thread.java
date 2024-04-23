package org.example.homework_2024_04_09.task3;

public class RunTask3_Thread {

//  3**. В классе писали задачу для поиска всех простых числа в диапазоне до 1 000 000.
//  Напишите программу, запустив которую вы сможете определить оптимальное количество
//  создаваемых потоков для выполнения этой задачи на текущем компьютере.
//  Используйте общее время выполнения программы при обработке всего диапазона чисел
//  для расчета оптимального количества созданных потоков.

    public static void main(String[] args) {

        // запускаю один поток, чтобы получить время выполнения задачи
        long startTime = System.currentTimeMillis();
        Task3_Thread thread = new Task3_Thread (2, 1_000_000);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long timeResult = endTime - startTime;
        System.out.println("Время: " + timeResult);

        int finalCountThreads = startThreads(Runtime.getRuntime().availableProcessors(), timeResult);
        System.out.println("Оптимальное количество потоков для этой задачи на данном компьютере: " + finalCountThreads);
   }

    public static int startThreads(int countThreads, long timeResult) {
        int rangeStart = 2;
        int rangeEnd = 1_000_000;

        long startTime = System.currentTimeMillis();
        int interval = (rangeEnd - rangeStart) / countThreads;
        int threadStart = rangeStart;
        int threadEnd = threadStart + interval;

        Task3_Thread[] threadArray = new Task3_Thread[countThreads];

        for (int i = 0; i < countThreads; i++) {
            threadArray[i] = new Task3_Thread(threadStart, threadEnd);
            threadArray[i].start();
            System.out.println("Поток " + i + " запущен: от " + threadStart + " до " + threadEnd);

            threadStart = threadEnd + 1;
            threadEnd = threadStart + interval - 1;
            if (i == (countThreads - 2)) {
                threadEnd = rangeEnd;
            }
        }

        for (int i = 0; i < countThreads; i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTime = System.currentTimeMillis();
        long currentTimeResult = endTime - startTime;
        System.out.println("Total time: " + currentTimeResult);

        if (currentTimeResult < timeResult) {
            countThreads = countThreads + 1;
            countThreads = startThreads( countThreads, currentTimeResult);
        } else {
            countThreads = countThreads - 1;
        }
        return countThreads;
    }
}
