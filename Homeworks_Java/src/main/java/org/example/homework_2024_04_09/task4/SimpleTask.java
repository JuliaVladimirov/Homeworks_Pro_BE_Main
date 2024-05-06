package org.example.homework_2024_04_09.task4;

public class SimpleTask {
    public static void main(String[] args) {
        int count = 0;

        long start = System.currentTimeMillis();

        for (int i = 2; i < 1000000; i++) {
            boolean isPrime = true;

            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
//                System.out.println(i);
            }
        }
        System.out.println("Count = "+count);
        System.out.println("Time = "+(System.currentTimeMillis()-start));
    }
}
