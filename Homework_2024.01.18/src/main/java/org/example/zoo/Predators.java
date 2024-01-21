package org.example.zoo;

public class Predators extends Animals { //Predators - хищники

    private String placeInZoo;


    public Predators(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 1";
    }

    public void huntAnimals() {
        System.out.println(super.getAnimalName() + " is a predator ans hunts animals.");

    }

    public void placePredators() {
        System.out.println("Our predators live in restricted area in " + placeInZoo + ".");
    }


    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }

    @Override
    public String toString() {
        return '\n' + "Predators{" +
                "Kind of animal=" + getAnimalName() +
                ", Quantity=" + getNumOfAnimals() +
                ", Number of legs=" + getNumOfLegs() +
                ", Number of wings=" + getNumOfWings() +
                ", Regular food=" + getFood() +
                ", Lives in=" + placeInZoo +
                '}';

    }
}


