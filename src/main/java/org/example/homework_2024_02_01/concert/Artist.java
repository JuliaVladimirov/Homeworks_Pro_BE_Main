package org.example.homework_2024_02_01.concert;

public abstract class Artist {

    private String name;

    public Artist(String name) {
        this.name = name;
    }

    abstract public void perform();

    public String getName() {
        return name;
    }
}
