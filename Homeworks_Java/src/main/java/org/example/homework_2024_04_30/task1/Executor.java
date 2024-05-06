package org.example.homework_2024_04_30.task1;

//1. Напишите программу просчета количества всех простых в диапазоне до 1 000 000.
//Просчет выполняйте в 4 потоках, которые создаются с помощью Callable.
//Получите результаты подсчета из каждого потока и напечатайте общий результат.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Executor {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        int totalRange = 100_000;// с моими 2 физическими и 4 логическими ядрами целый миллион даже в 4 потоках - это много :(
        int currentRange = totalRange / numberOfThreads;
        int start = 0;
        int end = start + currentRange;

        List<PrimeNumbersTask> taskList = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {

            taskList.add(new PrimeNumbersTask(start, end));

            start = end + 1;
            end = start + currentRange - 1;
            if (i == (numberOfThreads - 2)) {
                end = totalRange;
            }
        }
        executorService.invokeAll(taskList);

        List<Future<Integer>> futures = executorService.invokeAll(taskList);

        int result = 0;
        for (Future<Integer> future : futures) {

            System.out.println("Результаты подсчета из каждого потока: " + future.get());
            result = result + future.get();
        }
        System.out.println("Общий результат: " + result);

        executorService.shutdown();
    }
}