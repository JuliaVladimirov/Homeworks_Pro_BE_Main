package org.example.zoo;

public class MarineAnimals extends Animals {// marine animals - морские млекопитающие

    private String placeInZoo;


    public MarineAnimals(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 4";
    }

    public void swim() {
        System.out.println(super.getAnimalName() + " belongs to marine animals and likes to swim.");
    }

    public void placeMarineAnimals() {
        System.out.println("Our marine animals live in the pool in " + placeInZoo + ".");
    }

    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }

    @Override
    public String toString() {
        return '\n' + "MarineAnimals{" +
                "Kind of animal=" + getAnimalName() +
                ", Quantity=" + getNumOfAnimals() +
                ", Number of legs=" + getNumOfLegs() +
                ", Number of wings=" + getNumOfWings() +
                ", Regular food=" + getFood() +
                ", Lives in=" + placeInZoo +
                '}';
    }
}
