package org.example.house;

public class Roof {

    private String roofColor;
    private String roofMaterial;

    public Roof(String roofColor, String roofMaterial) {
        this.roofColor = roofColor;
        this.roofMaterial = roofMaterial;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }

    public String getRoofMaterial() {
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }
}
