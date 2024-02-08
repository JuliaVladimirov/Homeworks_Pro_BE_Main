package org.example.concert;

public class Concert<T extends Artist> {

    T artist;


    public Concert(T artist) {
        this.artist = artist;
    }
}
