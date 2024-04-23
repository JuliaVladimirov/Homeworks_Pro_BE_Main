package org.example.homework_2024_01_25.swimming;

public class Boat implements Swim{

    private int speed;

    public Boat(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("The boat can swim with the surface speed of " + speed + " km/h.");
    }
}
