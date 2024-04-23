package org.example.homework_2024_01_18.pets;

public class Cat extends Pet{

    private int numOfEyes;

    private String animal;

    public Cat() {
    }

    public Cat(String kindOfPet, String name, String color, int numberOfPaws, String food, String sleepingPlace, String sound, int numOfEars, int numOfEyes, String animal) {
        super(kindOfPet, name, color, numberOfPaws, food, sleepingPlace, sound, numOfEars);
        this.numOfEyes = numOfEyes;
        this.animal = animal;
    }

    public void seeInTheDark(){
        System.out.println(super.getName() + " can see in the dark with " + numOfEyes + " eyes.");
    }

    public void hunt(){
        System.out.println(super.getName() + " can hunt " + animal + ".");
    }



    public int getNumOfEyes() {
        return numOfEyes;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
