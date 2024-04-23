package org.example.homework_2024_01_23.house;

public class Window {

    private int numOfWindows;
    private String windowColor;

    public Window(int numOfWindows, String windowColor) {
        this.numOfWindows = numOfWindows;
        this.windowColor = windowColor;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public String getWindowColor() {
        return windowColor;
    }

    public void setWindowColor(String windowColor) {
        this.windowColor = windowColor;
    }
}
