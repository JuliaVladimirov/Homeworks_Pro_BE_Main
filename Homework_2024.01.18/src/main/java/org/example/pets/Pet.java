package org.example.pets;

public class Pet {

    private String kindOfPet;
    private String name;
    private String color;
    private int numberOfPaws;
    private String food;
    private String sleepingPlace;
    private String sound;
    private int numOfEars;

    public Pet() {
    }

    public Pet(String kindOfPet, String name, String color, int numberOfPaws, String food, String sleepingPlace, String sound, int numOfEars) {
        this.kindOfPet = kindOfPet;
        this.name = name;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.food = food;
        this.sleepingPlace = sleepingPlace;
        this.sound = sound;
        this.numOfEars = numOfEars;
    }

    public void run(){
        System.out.println("The " + kindOfPet + " by name " + name + ", is " + color + " and runs on " + numberOfPaws + " paws.");
    }

    public void eat(){
        System.out.println(name + " eats " + food + ".");
    }

    public void sleep(){
        System.out.println(name + " sleeps on/in " + sleepingPlace + ".");
    }

    public void makeSound(){
        System.out.println(name + " says " + sound + ".");
    }

    public void hear(){
        System.out.println(name + " hears with " + numOfEars + " ears.");
    }



    public String getKindOfPet() {
        return kindOfPet;
    }

    public void setKindOfPet(String kindOfPet) {
        this.kindOfPet = kindOfPet;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSleepingPlace() {
        return sleepingPlace;
    }

    public void setSleepingPlace(String sleepingPlace) {
        this.sleepingPlace = sleepingPlace;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNumOfEars() {
        return numOfEars;
    }

    public void setNumOfEars(int numOfEars) {
        this.numOfEars = numOfEars;
    }


}
