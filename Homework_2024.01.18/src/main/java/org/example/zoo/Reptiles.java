package org.example.zoo;

public class Reptiles extends Animals {

    private String placeInZoo;


    public Reptiles(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 6";
    }

    public void layEggs() {
        System.out.println("Like birds " + super.getAnimalName() + " can lay eggs.");
    }

    public void placeReptiles() {
        System.out.println("Our reptiles live in the big terrarium in " + placeInZoo + ".");
    }

    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }

    @Override
    public String toString() {
        return '\n' + "Reptiles{" +
                "Kind of animal=" + getAnimalName() +
                ", Quantity=" + getNumOfAnimals() +
                ", Number of legs=" + getNumOfLegs() +
                ", Number of wings=" + getNumOfWings() +
                ", Regular food=" + getFood() +
                ", Lives in=" + placeInZoo +
                '}';
    }
}
