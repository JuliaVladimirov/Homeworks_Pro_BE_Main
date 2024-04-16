package org.example.task1;

import java.util.concurrent.atomic.AtomicBoolean;

public class Competition {

//  На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
//  Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
//  но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения
//  переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
//  соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.

    public static void main(String[] args) {

        AtomicBoolean isHit = new AtomicBoolean(false);

        Athlete[] threadArray = new Athlete[5];
        for (int i = 0; i < 5; i++) {
            threadArray[i] = new Athlete(45, isHit);
            threadArray[i].start();
        }
        for (int i = 0; i < 5; i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
