package org.example.company;
//3*. Вы работаете на предприятии, где работает большое количество сотрудников.
//Создайте классы и схему наследования для организационной структуры предприятия:
//Базовый класс - Employee с перечнем характеристик и поведением, которые присутствуют у любого сотрудника.
//А далее все зависит от подразделений где они работают и их функциональных обязанностей.
public class Employee {

    private String firstName;

    private String lastName;

    private int age;

    private int salary;

    private int workingYears;

    private String department;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, int salary, int workingYears, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.workingYears = workingYears;
        this.department = department;
    }

    public void describeEmployee(){
        System.out.println(firstName + " " + lastName + " is an employee in our company. He/she is " + age + " year old.");
        System.out.println("Mr./Mrs. " + lastName + " works in " + department + " department.");
        System.out.println("His/her salary is " + salary + " Euro.");
        System.out.println("His/her working experience is " + workingYears + "years.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(int workingYears) {
        this.workingYears = workingYears;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}




