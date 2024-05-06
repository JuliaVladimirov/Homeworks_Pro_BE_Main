package org.example.homework_2024_04_16.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class EarnMillion {

//  2*. Одна компания решила заработать миллион. Для этого они решили создать курсы, где за 1000
//  можно обучиться чему-то очень интересному и полезному:
//  они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
//  Напишите программу, которая даст возможность набирать студентов на курс до тех пор,
//  пока компания не заработает миллион :) Используйте AtomicInteger для накопления.

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        while(counter.get() < 1_000_000){
            new Student(1000, 10, counter).start();
            Thread.sleep(5);
        }
        System.out.println("We earned " + counter.get());
    }
}
