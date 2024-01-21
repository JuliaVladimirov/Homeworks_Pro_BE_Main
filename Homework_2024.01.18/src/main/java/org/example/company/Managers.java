package org.example.company;

public class Managers extends Employee {

    private int officeNumber;


    public Managers(String firstName, String lastName, int age, int salary, int workingYears, String department) {
        super(firstName, lastName, age, salary, workingYears, department);
        this.officeNumber = 105;
    }

    public void holdMeeting(){
        System.out.println("Mr./Mrs. " + super.getLastName() + " works in office number " + officeNumber + ".");
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}
