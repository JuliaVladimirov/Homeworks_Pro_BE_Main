package org.example.auto;

public class Auto implements AutoMechanic, Driver {

    private String autoName;
    private String engineType;
    private int numOfWheels;
    private String color;
    private int averageSpeed;
    private String radioFrequency;

    public Auto(String autoName, String engineType, int numOfWheels, String color, int averageSpeed, String radioFrequency) {
        this.autoName = autoName;
        this.engineType = engineType;
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.averageSpeed = averageSpeed;
        this.radioFrequency = radioFrequency;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getRadioFrequency() {
        return radioFrequency;
    }

    public void setRadioFrequency(String radioFrequency) {
        this.radioFrequency = radioFrequency;
    }


}
