package org.example.task1a;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class RunRobotsA {

//1. У вас есть стол, на который один робот-манипулятор кладет деталь, а второй забирает эту деталь.
//Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь
//и только тогда класть следующую. Постройте программу, которая автоматизирует эту работу.
//Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество деталей, которые должны обработать манипуляторы");
        int counter = scanner.nextInt();

        AtomicInteger part = new AtomicInteger();

        Robot1 robot1 = new Robot1(part, counter);
        Robot2 robot2 = new Robot2(part, counter);
        robot1.start();
        robot2.start();

    }
}

