package org.example.concert;

public class Singer extends Artist {
    public Singer(String name) {
        super(name);

    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is singing");
    }
}
