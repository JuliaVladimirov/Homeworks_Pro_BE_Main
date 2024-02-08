package org.example.concert;

public class Actor extends Artist {

    public Actor(String name) {
        super(name);

    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is playing a role");
    }
}