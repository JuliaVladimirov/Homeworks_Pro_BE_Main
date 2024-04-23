package org.example.homework_2024_02_09.task5;

public class House {
    private double height;
    private int numOfWindows;

    public House(double height, int numOfWindows) {
        this.height = height;
        this.numOfWindows = numOfWindows;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    @Override
    public String toString() {
        return "House{" +
                "Height=" + height +
                ", Windows=" + numOfWindows +
                '}';
    }
}
