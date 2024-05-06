package org.example.homework_2024_01_18.company;

public class Salesmen extends Employee {

   private int numOfClients;

    public Salesmen(String firstName, String lastName, int age, int salary, int workingYears, String department, int numOfClients) {
        super(firstName, lastName, age, salary, workingYears, department);
        this.numOfClients = numOfClients;
    }

    public void saleProduct(){
        System.out.println("The salesmen sale our products to " + numOfClients + " clients.");
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public void setNumOfClients(int numOfClients) {
        this.numOfClients = numOfClients;
    }
}
