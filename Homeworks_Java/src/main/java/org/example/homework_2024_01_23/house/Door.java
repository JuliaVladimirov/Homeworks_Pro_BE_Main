package org.example.homework_2024_01_23.house;

public class Door {
    private int numOfDoors;
    private String doorColor;

    public Door(int numOfDoors, String doorColor) {
        this.numOfDoors = numOfDoors;
        this.doorColor = doorColor;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }
}
