package org.example.homework_2024_02_01.concert;

public class Concert<T extends Artist> {

    T artist;


    public Concert(T artist) {
        this.artist = artist;
    }
}
