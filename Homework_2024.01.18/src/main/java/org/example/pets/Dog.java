package org.example.pets;

public class Dog extends Pet {

    private int numOfTails;

    private String object;

    public Dog() {
    }

    public Dog(String kindOfPet, String name, String color, int numberOfPaws, String food, String sleepingPlace, String sound, int numOfEars, int numOfTails, String object) {
        super(kindOfPet, name, color, numberOfPaws, food, sleepingPlace, sound, numOfEars);
        this.numOfTails = numOfTails;
        this.object = object;
    }

    public void wagTheTail() {// вилять хвостом
        System.out.println(super.getName() + " can wag with " + numOfTails + " tail.");
    }

    public void bringToOwner(){
        System.out.println(super.getName() + " can bring " + object + " to it's owner.");
    }

    public int getNumOfTails() {
        return numOfTails;
    }

    public void setNumOfTails(int numOfTails) {
        this.numOfTails = numOfTails;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
