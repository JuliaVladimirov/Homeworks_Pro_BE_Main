package org.example.homework_2024_04_16.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Thread{

//  2*. Одна компания решила заработать миллион. Для этого они решили создать курсы, где за 1000
//  можно обучиться чему-то очень интересному и полезному:
//  они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
//  Напишите программу, которая даст возможность набирать студентов на курс до тех пор,
//  пока компания не заработает миллион :) Используйте AtomicInteger для накопления.



// Вывела стоимость обучения и преподавательский процент в поля.
// Ситуация на рынке меняется, и цены могут подрасти )))).
    private int payment;
    private int teachersPercent;
    private AtomicInteger counter;

    public Student(int payment, int teachersPercent, AtomicInteger counter) {
        this.payment = payment;
        this.teachersPercent = teachersPercent;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.set(counter.get() + payment - (payment / 100 * teachersPercent));
        System.out.println(Thread.currentThread().getName() + " has paid for his study.");
        System.out.println("Counter: " + counter.get());
    }
}
