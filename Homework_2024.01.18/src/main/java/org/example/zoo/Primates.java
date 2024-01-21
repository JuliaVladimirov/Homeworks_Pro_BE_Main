package org.example.zoo;

public class Primates extends Animals { // Primates - приматы

    private String placeInZoo;


    public Primates(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 2";
    }

    public void swingVine() { // качаться на лиане
        System.out.println(super.getAnimalName() + " is a primate and likes to swing from vine to vine.");
    }

    public void placePrimates() {
        System.out.println("Our primates live in trees in " + placeInZoo + ".");
    }

    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }

    @Override
    public String toString() {
        return '\n' + "Primates{" +
                "Kind of animal=" + getAnimalName() +
                ", Quantity=" + getNumOfAnimals() +
                ", Number of legs=" + getNumOfLegs() +
                ", Number of wings=" + getNumOfWings() +
                ", Regular food=" + getFood() +
                ", Lives in=" + placeInZoo +
                '}';
    }
}
