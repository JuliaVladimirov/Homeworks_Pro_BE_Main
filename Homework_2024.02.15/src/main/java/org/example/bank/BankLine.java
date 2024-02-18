package org.example.bank;

import java.util.*;

//        1) Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, которые Вы получаете в автомате при входе.
//        При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
//        Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
//        После регистрации - вы получаете номер талончика.
//        Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
//        Создать множество, которое будет обслуживать класс Ticket.
//        Подумайте какой тип Set-а вы могли бы использовать для этой задачи.
//        Сымитируйте работу отделения банка.

public class BankLine {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, "Tom", "Smith", 1980, OperationType.DEPOSIT);
        Ticket ticket2 = new Ticket(2, "Sam", "Green", 1995, OperationType.CONSULTATION);
        Ticket ticket3 = new Ticket(3, "Alex", "Brown", 2001, OperationType.WITHDRAWAL);
        Ticket ticket4 = new Ticket(4, "Mary", "Anderson", 1975, OperationType.ACCOUNT_OPENING);
        Ticket ticket5 = new Ticket(5, "Nancy", "Hamilton", 1967, OperationType.COMMUNAL_FEES);
        Ticket ticket6 = new Ticket(6, "Tim", "Miller", 1983, OperationType.DEPOSIT);
        Ticket ticket7 = new Ticket(7, "Sally", "Robertson", 1969, OperationType.CONSULTATION);
        Ticket ticket8 = new Ticket(8, "Alen", "Bree", 1986, OperationType.WITHDRAWAL);
        Ticket ticket9 = new Ticket(9, "Tina", "Peterson", 1978, OperationType.ACCOUNT_OPENING);
        Ticket ticket10 = new Ticket(10, "Celina", "Harrison", 1998, OperationType.COMMUNAL_FEES);

        TreeSet<Ticket> treeSet = new TreeSet<>();
        treeSet.add(ticket1);
        treeSet.add(ticket10);
        treeSet.add(ticket9);
        treeSet.add(ticket2);
        treeSet.add(ticket3);
        treeSet.add(ticket8);
        treeSet.add(ticket7);
        treeSet.add(ticket4);
        treeSet.add(ticket6);
        treeSet.add(ticket5);
        System.out.println(treeSet);
        System.out.println();

        operateLine(treeSet);
        System.out.println(treeSet);

    }

    public static void operateLine(TreeSet<Ticket> treeSet) {
        TreeSet<Ticket> treeSet1 = new TreeSet<>();
        for (Ticket ticket : treeSet) {
            provideBankingServices(ticket);
            treeSet1.add(ticket);
        }
        treeSet.removeAll(treeSet1);
        treeSet1.clear();
    }


    public static void provideBankingServices(Ticket ticket) {
        switch (ticket.getOperationType()) {
            case CONSULTATION:
                System.out.println("Dear customer: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("For " + ticket.getOperationType() + " go to the department 1");
                System.out.println();
                break;
            case DEPOSIT:
                System.out.println("Dear customer: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("For " + ticket.getOperationType() + " go to the department 2");
                System.out.println();
                break;
            case WITHDRAWAL:
                System.out.println("Dear customer: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("For " + ticket.getOperationType() + " go to the department 3");
                System.out.println();
                break;
            case ACCOUNT_OPENING:
                System.out.println("Dear customer: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("For " + ticket.getOperationType() + " go to the department 4");
                System.out.println();
                break;
            case COMMUNAL_FEES:
                System.out.println("Dear customer: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("For " + ticket.getOperationType() + " go to the department 5");
                System.out.println();
                break;
        }

    }
}


