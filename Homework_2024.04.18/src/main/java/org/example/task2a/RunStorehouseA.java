package org.example.task2a;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class RunStorehouseA {

//2*. На склад приезжает машина, в которой загружено N ящиков (пользователь вводит с клавиатуры).
//Автоматизированный разгрузчик вытягивает с машины ящик и кладёт на рампу с определенным интервалом времени,
//на которой может одновременно разместиться например 2 ящика.
//В это время подъезжает автоматизированный погрузчик и везет его на место хранения. Он за раз может взять всего
//1 ящик. Каждый участник процесса представлен в виде отдельного потока Java.
//Создайте программу, которая синхронизирует работу в данном процессе разгрузки автомобиля, с условием того,
//что Разгрузчик может быть только один, а Погрузчиков может быть 2 и более (на ваше усмотрение).


// Сделала эту задачу двумя способами: простой вариант с помощью AtomicInteger и вариант посложнее через стэки.


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many boxes are in the truck?");
        int numberOfBoxes = scanner.nextInt();
        AtomicInteger boxesInTruck = new AtomicInteger(numberOfBoxes);
        AtomicInteger boxesOnDock = new AtomicInteger(0);

        Unloader unloader = new Unloader(boxesInTruck,boxesOnDock);
        Loader loader1 = new Loader(boxesOnDock, boxesInTruck);
        Loader loader2 = new Loader(boxesOnDock, boxesInTruck);

        unloader.start();

        Thread.sleep(1000);

        loader1.start();
        loader2.start();

        unloader.join();
        loader1.join();
        loader2.join();


        System.out.println(boxesInTruck);
        System.out.println(boxesOnDock);
    }
}
