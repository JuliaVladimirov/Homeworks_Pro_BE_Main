package org.example.task1_task2;

import java.util.LinkedList;
import java.util.Queue;


public class RunStorehouse2 {
    public static void main(String[] args) {

        Queue<BricksBatch> storeHouse2 = new LinkedList<>();;
        storeHouse2.offer(new BricksBatch(50, 20000));
        storeHouse2.offer(new BricksBatch(51, 25000));
        storeHouse2.offer(new BricksBatch(52, 10000));
        storeHouse2.offer(new BricksBatch(53, 30000));
        storeHouse2.offer(new BricksBatch(54, 15000));
        storeHouse2.offer(new BricksBatch(55, 20000));
        System.out.println("Склад после загрузки партий кирпичей на склад:");
        System.out.println(storeHouse2);
        System.out.println();

        System.out.println("Первая партия кирпичей на отгрузку № " + storeHouse2.peek().getBatchNumber());
        System.out.println();

        System.out.println("Партия кирпичей № " + storeHouse2.poll().getBatchNumber() + " отгружена клиенту." );
        System.out.println();

        System.out.println("Склад после отгрузки партии кирпичей клиенту:");
        System.out.println(storeHouse2);
        System.out.println();

        System.out.println("Следующая партия кирпичей на отгрузку № " + storeHouse2.peek().getBatchNumber() );
        System.out.println();

        System.out.println("Партия кирпичей № " + storeHouse2.poll().getBatchNumber() + " отгружена клиенту." );
        System.out.println();

        System.out.println("Склад после отгрузки партии кирпичей клиенту:");
        System.out.println(storeHouse2);
    }
}

//  2)* Тот же склад, что и в случае п.1, но у Вас есть две двери - одна в начале склада, вторая в конце.
//      Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//      Напишите программу, которая бы имитировала работу.
