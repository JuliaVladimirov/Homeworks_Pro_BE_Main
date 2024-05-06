package org.example.homework_2024_02_01.box;

public class Box<T> {
    private final T HEIGHT;
    private final T LENGTH;
    private final T WIDTH;


    public Box(T HEIGHT, T LENGTH, T WIDTH) {
        this.HEIGHT = HEIGHT;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
    }

    public T getHEIGHT() {
        return HEIGHT;
    }

    public T getLENGTH() {
        return LENGTH;
    }

    public T getWIDTH() {
        return WIDTH;
    }
}
