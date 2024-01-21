package org.example.company;

public class Bookkeepers extends Employee {

    public Bookkeepers(String firstName, String lastName, int age, int salary, int workingYears, String department) {
        super(firstName, lastName, age, salary, workingYears, department);
    }

    public void countProfit(){
        System.out.println("The bookkeepers count the profit from 8AM till 5PM.");
    }
}
