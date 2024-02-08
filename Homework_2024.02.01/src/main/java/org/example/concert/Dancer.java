package org.example.concert;

public class Dancer extends Artist {
    public Dancer(String name) {
        super(name);

    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is dancing");
    }
}
