package org.example.coffeemachine;

public enum CoffeeMachine {
    COFFEE_MACHINE ("filtered water", "Arabica coffee", "3% milk", "sugar");

    private String water;
    private String coffee;
    private String milk;
    private String sugar;

    CoffeeMachine(String water, String coffee, String milk, String sugar) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
        this.sugar = sugar;
    }

    CoffeeMachine() {
    }

    @Override
    public String toString() {
        return "CoffeeMachine makes coffee from four ingredients: " + water + ", " + coffee + " and " + milk + ". You also can add " + sugar + ".";
    }

    public void makeMilkCoffee(){
        System.out.println("To make milk coffee you need: 1 part of " + coffee + ", 1 part of " + water + " and 1 part of " + milk + ".");
    }

    public void makeAmericano(){
        System.out.println("To make Americano you need: 1 part of " + coffee + " and 2 parts of " + water + ".");
    }

    public void makeCappuccino(){
        System.out.println("To make Cappuccino you need: 1 part of " + coffee + " and 2 parts of " + milk + ".");
    }

    public void addSugar(){
        System.out.println("You can add " + sugar + " to your coffee.");
    }

}
