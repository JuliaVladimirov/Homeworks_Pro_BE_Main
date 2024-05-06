package org.example.homework_2024_01_18.company;

public class Workers extends  Employee {

    private String productName;

    public Workers(String firstName, String lastName, int age, int salary, int workingYears, String department, String productName) {
        super(firstName, lastName, age, salary, workingYears, department);
        this.productName = productName;
    }

    public void manufactureProduct(){
        System.out.println("The production department manufactures " + productName);
    }


    public String getProduct() {
        return productName;
    }

    public void setProduct(String productName) {
        this.productName = productName;
    }

}
