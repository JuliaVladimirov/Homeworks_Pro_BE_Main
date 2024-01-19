package org.example.zoo;

public class Reptiles extends Animals {

    private String placeInZoo;


    public Reptiles(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 6";
    }

    public void layEggs() {
        System.out.println("Unlike birds " + super.getAnimalName() + " can not fly but can lay eggs.");
    }

    public void placeReptiles() {
        System.out.println("OUr reptiles live in the big terrarium in " + placeInZoo + ".");
    }
}
