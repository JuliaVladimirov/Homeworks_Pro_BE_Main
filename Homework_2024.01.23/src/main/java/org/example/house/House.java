package org.example.house;

import java.util.ArrayList;
import java.util.Arrays;

public class House {

    private int houseHeight;
    private String houseColor;
    private Roof roof;
    private Wall wall;
    private Window window;
    private Door door;
    private HouseResident[] resident;


    public House(int houseHeight, String houseColor) {
        this.houseHeight = houseHeight;
        this.houseColor = houseColor;
        this.roof = new Roof("red", "tile");
        this.wall = new Wall(4, "white");
        this.window = new Window(3, "white");
        this.door = new Door(1, "braun");

    }

    public int getHouseHeight() {
        return houseHeight;
    }

    public void setHouseHeight(int houseHeight) {
        this.houseHeight = houseHeight;
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

    public HouseResident[] getResident() {
        return resident;
    }

    public void setResident(HouseResident[] resident) {
        this.resident = resident;
    }

    public void buildHouse() {
        System.out.println("This house is " + getHouseColor() + " and " + getHouseHeight() + " meters high.");
        System.out.println("It has: ");
        System.out.println(getRoof().getRoofColor() + " " + getRoof().getRoofMaterial() + " roof,");
        System.out.println(getWall().getNumOfWalls() + " " + getWall().getWallColor() + " walls,");
        System.out.println(getWindow().getNumOfWindows() + " " + getWindow().getWindowColor() + " windows,");
        System.out.println(getDoor().getNumOfDoors() + " " + getDoor().getDoorColor() + " doors.");
    }

    public void populateHouse(HouseResident[] residents) {
        System.out.println("In this house live:");
        for (int i = 0; i < residents.length; i++) {
            System.out.println((i+1) + "." + getResident()[i].getWhoIs() + " " + getResident()[i].getName() + ", " + getResident()[i].getAge() + " years old.");
        }
    }
}
