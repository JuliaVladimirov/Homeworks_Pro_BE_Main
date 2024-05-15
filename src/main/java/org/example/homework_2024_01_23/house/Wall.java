package org.example.homework_2024_01_23.house;

public class Wall {

    private int numOfWalls;
    private String wallColor;

    public Wall(int numOfWalls, String wallColor) {
        this.numOfWalls = numOfWalls;
        this.wallColor = wallColor;
    }

    public int getNumOfWalls() {
        return numOfWalls;
    }

    public void setNumOfWalls(int numOfWalls) {
        this.numOfWalls = numOfWalls;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }
}
