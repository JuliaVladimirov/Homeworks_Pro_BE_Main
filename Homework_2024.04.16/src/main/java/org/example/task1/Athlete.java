package org.example.task1;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Athlete extends Thread {

//  На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
//  Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
//  но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения
//  переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
//  соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.

    private int target;
    private AtomicBoolean isHit;

    public Athlete(int target,AtomicBoolean isHit ) {
        this.target = target;
        this.isHit = isHit;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (!isHit.get()){
            int shot = random.nextInt(100);
            System.out.println(Thread.currentThread().getName() + " is shooting.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (shot == target) {
                System.out.println(Thread.currentThread().getName() + " shot the target.");
                isHit.set(true);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}
