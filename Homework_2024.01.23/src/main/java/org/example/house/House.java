package org.example.house;

public class House {

    private int houseHeight;
    private int numOfFloors;
    private String houseColor;
    private Roof roof;
    private Wall wall;
    private Window window;
    private Door door;

    public House(int houseHeight, int numOfFloors, String houseColor, Roof roof, Wall wall, Window window, Door door) {
        this.houseHeight = houseHeight;
        this.numOfFloors = numOfFloors;
        this.houseColor = houseColor;
        this.roof = roof;
        this.wall = wall;
        this.window = window;
        this.door = door;
    }

    public int getHouseHeight() {
        return houseHeight;
    }

    public void setHouseHeight(int houseHeight) {
        this.houseHeight = houseHeight;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
