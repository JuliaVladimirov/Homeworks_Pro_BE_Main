package org.example.homework_2024_04_18.task1b;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class RunRobotsB {

//Я написала еще один вариант этой задачи, немного изменив последнее условие.
// Теперь пользователь задает с клавиатуры время, в течение которого должны работать манипуляторы.


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время (в секундах), в течение которого должны обработать манипуляторы");
        int time = scanner.nextInt();

        AtomicBoolean startWorking = new AtomicBoolean(true);
        AtomicInteger part = new AtomicInteger();

        Robot1 robot1 = new Robot1(part, startWorking);
        Robot2 robot2 = new Robot2(part, startWorking);
        robot1.start();
        robot2.start();

        Thread.sleep(time * 1000L);
        startWorking.set(false);
    }
}
