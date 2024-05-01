package org.example.homework_2024_04_30.task2;

//2*. У вас есть задача проверять какой-то сайт, с целью проверки опубликования
//на нем новой информации, но если мы будем слишком часто проверять этот сайт,
//то нас могут "забанить" за спам. Чтобы избежать этого, вы должны слать свои запросы
//не чаще чем один раз в минуту.
//Ваша задача должна работать параллельно основной функциональности и не занимать ресурсы
//главного потока.
//Подумайте, какой механизм Java вы могли бы использовать для автоматизации данной задачи.
//Как реализацию работы с сайтом, просто выведите сообщение о том, что соединение
//установлено и выведите текущее время.

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SendRequests {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        long delay = 0;
        for (int i = 0; i < 20; i++) {// Количество запросов ставлю от балды, в задаче не указано
            scheduler.schedule(new Request(i), delay, TimeUnit.MINUTES);
            delay++;

        }
        scheduler.shutdown();

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " - Главный поток продолжает работать");// главный поток продолжает работать параллельно выполнению запросов
            Thread.sleep(60_000);
        }


    }
}

