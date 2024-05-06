package org.example.homework_2024_04_23.task1;

import java.util.concurrent.Semaphore;

//  1. У вас в магазине распродажа. К Вам набежало 10 000 клиентов и Вы пытаетесь корректно всех обслужить с учетом того,
//  что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно карантинным нормам)
//  и время обслуживания одного покупателя занимает 30 секунд (это время можно менять, чтобы увидеть окончание работы ;)).
//  Сымитируйте данный процесс работы и подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
//  Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?


//  Я создавала все потоки через отдельный класс,

public class Shop {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(10, true);

        for (int i = 0; i < 10_000; i++) {
            new Client(semaphore).start();
        }

//  но можно было прямо в методе main, поскольку кода не много,

//        for (int i = 0; i < 10_000; i++) {
//            new Thread(() -> {
//                try {
//                    semaphore.acquire();
//                    System.out.println("Client -" + Thread.currentThread().getName() + " entered the shop");
//                    Thread.sleep(30_000);
//                    System.out.println("Client -" + Thread.currentThread().getName() + " leaves");
//                    semaphore.release();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();
//        }

    }
}


