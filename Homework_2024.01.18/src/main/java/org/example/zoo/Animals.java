package org.example.zoo;

public class Animals {
    private int numOfAnimals;

    private String animalName;


    private int numOfLegs;

    private int numOfWings;

    private String food;

    public Animals() {
    }

    public Animals(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        this.numOfAnimals = numOfAnimals;
        this.animalName = animalName;
        this.numOfLegs = numOfLegs;
        this.numOfWings = numOfWings;
        this.food = food;
    }

    public void describeAnimal() {
        System.out.println("In our zoo we have " + numOfAnimals + " " + animalName + ".");
        System.out.println(animalName + " has " + numOfLegs + " legs, and " + numOfWings + " wings.");
    }

    public void eat() {
        System.out.println(animalName + " eats mostly " + food + ".");
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}







