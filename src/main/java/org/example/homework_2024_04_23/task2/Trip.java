package org.example.homework_2024_04_23.task2;

import java.util.concurrent.CountDownLatch;

//  2*. Вы едете на экскурсию. Каждый человек, при входе в автобус, называет свою фамилию.
//  Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает и автобус уезжает на экскурсию.
//  Сымитируйте данный процесс работы.
//  Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

public class Trip {
    public static void main(String[] args) throws InterruptedException {

        String[] touristNames = new String[]{"Smith", "Green", "Anderson", "Brown", "Johnson", "Taylor", "Wilson", "Evans"};

        CountDownLatch countDownLatch = new CountDownLatch(touristNames.length);

        for (int i = 0; i < touristNames.length; i++) {
            new Tourist(touristNames[i], countDownLatch).start();
            Thread.sleep(100);
        }
        System.out.println("Все туристы собрались, и автобус уехал на экскурсию");
    }
}



