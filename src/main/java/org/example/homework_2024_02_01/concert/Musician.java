package org.example.homework_2024_02_01.concert;

public class Musician extends Artist {
    public Musician(String name) {
        super(name);

    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is playing piano");
    }
}
