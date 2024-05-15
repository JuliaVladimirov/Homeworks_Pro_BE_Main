package org.example.homework_2024_04_09.task1;

import java.util.Scanner;

public class RunTask1_Thread {

//  1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
//  введенной цифре, нумеруете их и запускаете на выполнение.
//  Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 миллисекунд перед каждым выводом.
//  Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfThreads = 0;
        while (numberOfThreads < 1) {
            System.out.print("Введите количество потоков для обработки задачи: ");
            numberOfThreads = scanner.nextInt();
        }

        Task1_Thread[] threadArray = new Task1_Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threadArray[i] = new Task1_Thread(100, 100); // ввела переменные в конструктор, если вдруг надо будет поменять интервал или количество раз.
            threadArray[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Задача выполнена.");
    }
}




