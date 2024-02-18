package org.example.restaurant;

import org.example.bank.Ticket;

public class Order implements Comparable<Order> {

    private int orderNumber;

    private PizzaNames pizzaNames;

    public Order(int orderNumber, PizzaNames pizzaNames) {
        this.orderNumber = orderNumber;
        this.pizzaNames = pizzaNames;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PizzaNames getPizzaNames() {
        return pizzaNames;
    }

    public void setPizzaNames(PizzaNames pizzaNames) {
        this.pizzaNames = pizzaNames;
    }


    @Override
    public int compareTo(Order other) {
        return this.orderNumber - other.orderNumber;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "orderNumber=" + orderNumber +
                ", pizzaNames=" + pizzaNames +
                '}';
    }
}

