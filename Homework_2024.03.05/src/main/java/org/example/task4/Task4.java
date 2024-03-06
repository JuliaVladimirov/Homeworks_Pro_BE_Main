package org.example.task4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;

public class Task4 {
    public static void main(String[] args) {


        List<Employee> employeeList = Arrays.asList(new Employee("John", "Chen", "Accounting", 2200),
                new Employee("Den", "Raphaeli", "Purchasing", 6000),
                new Employee("Sigal", "Tobias", "Purchasing", 2500),
                new Employee("David", "Austin", "IT", 4800),
                new Employee("Adam", "Fripp", "Marketing", 6200),
                new Employee("James", "Landry", "Marketing", 2400),
                new Employee("Sarah", "Bell", "Sales", 4800),
                new Employee("Lisa", "Fox", "Sales", 3200),
                new Employee("John", "Russell", "Finances", 3200));

//        2. Вычислить среднюю зарплату всех сотрудников.

        Double averageSalary = employeeList.stream()
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();

        System.out.println("Средняя зарплата сотрудников " + averageSalary + ".\n");


//        3. Получить список сотрудников с зп > 1000

        List<Employee> employeeList1 = employeeList.stream()
                .filter(employee -> employee.getSalary() > 3000)// у меня фирма солидная, зарплаты высокие :)
                .toList();
        System.out.println("Сотрудники с зарплатой выше 3000:");
        System.out.println(employeeList1 + "\n");


//        4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%

        List<Employee> employeeList2 = employeeList.stream()
                .filter(employee -> employee.getDepartment().contains("Marketing"))
                .map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getDepartment(), (employee.getSalary() + (employee.getSalary() * 15 / 100))))
                .toList();

        System.out.println("Сотрудникам из отдела маркетинг зарплата увеличена на 15%:");
        System.out.println(employeeList2 + "\n");


//        5. Получить сотрудника с самой низкой зп

        Employee lowSalaryEmployee = employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("Сотрудник с самой низкой зп:");
        System.out.println(lowSalaryEmployee + "\n");

//        6*. Получить сотрудника с самой высокой зп

        Employee highSalaryEmployee = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Сотрудник с самой высокой зп:");
        System.out.println(highSalaryEmployee + "\n");

//        7. Получите сотрудников из всех отделов с максимальной зп

        Map<String, TreeSet<Employee>> employeesByDepartment = employeeList.stream()
                .collect(groupingBy(Employee::getDepartment, toCollection(() -> new TreeSet<>(comparingInt(Employee::getSalary).reversed()))));
        employeesByDepartment.forEach((department, employees) ->
                System.out.println("Отдел: " + department + " , сотрудник: " + employees.first().getFirstName() + " " + employees.first().getLastName() + " - " + employees.first().getSalary()));
        System.out.println();


//        8. Сгруппировать сотрудников по должности
        Map<String, List<Employee>> jobTitleEmployees = employeeList.stream()
                .collect(groupingBy(employee -> employee.getDepartment()));

        System.out.println("Сотрудник по отделам:");
        System.out.println(jobTitleEmployees);
    }
}
