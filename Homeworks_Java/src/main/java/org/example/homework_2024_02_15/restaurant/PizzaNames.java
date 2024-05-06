package org.example.homework_2024_02_15.restaurant;

public enum PizzaNames {

    PIZZA_MARGHERITA ("Margherita Pizza"),
    PEPPERONI_PIZZA ("Pepperoni Pizza"),
    HAWAIIAN_PIZZA ("Hawaiian Pizza"),
    FOUR_CHEESE_PIZZA ("Four Cheese Pizza"),
    NEAPOLITAN_PIZZA ("Neapolitan Pizza"),
    SICILIAN_PIZZA ("Sicilian Pizza"),
    GREEK_PIZZA ("Greek Pizza"),
    PIZZA_CARBONARA ("Pizza Carbonara"),
    PIZZA_DIAVOLA ("PIzza Diavola"),
    PIZZA_FRUTTI_DI_MARE ("Pizza Frutti di Mare");


    PizzaNames() {
    }
    private String title;

    PizzaNames(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return  title;
    }
}
