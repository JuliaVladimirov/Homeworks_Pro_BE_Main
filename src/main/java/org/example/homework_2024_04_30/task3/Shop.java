package org.example.homework_2024_04_30.task3;

//3*. В одном из предыдущей ДЗ у вас была задача:
//У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы пытаетесь корректно всех обслужить с
//учетом того, что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно
//карантинным нормам) и время обслуживания одного покупателя занимает 30 секунд.
//Сымитируйте данный процесс работы и подсчитайте за какой период времени вы сможете обслужить данный
//объем покупателей?
//Отдельный покупатель - отдельный поток.
//Можно было бы реализовать данную задачу не используя семафор?

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Shop {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Client> clientList = new ArrayList<>();

        for (int i = 0; i < 10_000; i++) {
            clientList.add(new Client());
        }
        executorService.invokeAll(clientList);

        List<Future<Long>> results = executorService.invokeAll(clientList);

        long timeResult = 0;
        for (Future<Long> result : results) {

            timeResult = timeResult + result.get();
        }
        System.out.println("Общее время обслуживания: " + timeResult);

        executorService.shutdown();
    }
}
