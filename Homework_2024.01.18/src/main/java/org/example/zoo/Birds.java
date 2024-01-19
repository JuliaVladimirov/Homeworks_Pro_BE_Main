package org.example.zoo;

public class Birds extends Animals {

    private String placeInZoo;


    public Birds(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 5";
    }

    public void fly() {
        System.out.println("Unlike other animals " + super.getAnimalName() + " has can fly.");
    }

    public void placeBirds() {
        System.out.println("Our birds live in the big aviary in " + placeInZoo + ".");// aviary - вольер
    }

    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }
}
