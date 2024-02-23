package org.example.task1_task2;

import java.util.Stack;

public class RunStorehouse1 {
    public static void main(String[] args) {

        Stack<BricksBatch> storeHouse1 = new Stack<>();
        storeHouse1.push(new BricksBatch(50, 20000));
        storeHouse1.push(new BricksBatch(51, 25000));
        storeHouse1.push(new BricksBatch(52, 10000));
        storeHouse1.push(new BricksBatch(53, 30000));
        storeHouse1.push(new BricksBatch(54, 15000));
        storeHouse1.push(new BricksBatch(55, 20000));
        System.out.println("Склад после загрузки партий кирпичей на склад:");
        System.out.println(storeHouse1);
        System.out.println();

        System.out.println("Первая партия кирпичей на отгрузку № " + storeHouse1.peek().getBatchNumber() );
        System.out.println();

        System.out.println("Партия кирпичей № " + storeHouse1.pop().getBatchNumber() + " отгружена клиенту." );
        System.out.println();

        System.out.println("Склад после отгрузки партии кирпичей клиенту:");
        System.out.println(storeHouse1);
        System.out.println();

        System.out.println("Следующая партия кирпичей на отгрузку № " + storeHouse1.peek().getBatchNumber() );
        System.out.println();

        System.out.println("Партия кирпичей № " + storeHouse1.pop().getBatchNumber() + " отгружена клиенту." );
        System.out.println();

        System.out.println("Склад после отгрузки партии кирпичей клиенту:");
        System.out.println(storeHouse1);


    }
}

    //  1)  Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
    //      У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
    //      Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
    //      Напишите программу, которая бы имитировала работу.
