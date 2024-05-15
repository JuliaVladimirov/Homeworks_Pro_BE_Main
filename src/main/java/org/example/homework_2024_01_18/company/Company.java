package org.example.homework_2024_01_18.company;

public class Company {
    public static void main(String[] args) {

        Managers manager1 = new Managers("Bob", "Deelan", 45, 10000, 10, "Management");
        manager1.describeEmployee();
        manager1.holdMeeting();

        System.out.println("---------------------------------------------------");

        Bookkeepers bookkeeper1 = new Bookkeepers("Mary", "Green", 27, 3000, 5, "Bookkeeping");
        bookkeeper1.describeEmployee();
        bookkeeper1.countProfit();

        System.out.println("---------------------------------------------------");

        Salesmen salesman1 = new Salesmen("Greg", "Miller", 33, 5000, 3, "Sales", 56);
        salesman1.describeEmployee();
        salesman1.saleProduct();

        System.out.println("---------------------------------------------------");

        Workers worker1 = new Workers("Ben", "Smith", 39, 4000, 7, "Production", "furniture");
        worker1.describeEmployee();
        worker1.manufactureProduct();
    }

}
