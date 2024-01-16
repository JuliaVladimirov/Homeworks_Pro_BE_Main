package org.example;

public class Phone {

    private int number;
    String model;
    int weight;


    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }

    public int getNumber(){
        return number;
    }

    Phone (int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
}
