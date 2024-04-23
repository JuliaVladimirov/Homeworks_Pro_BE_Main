package org.example.homework_2024_03_07.part3;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private String jobTitle;
    private String company;
    private String city;

    public Employee(String firstName, String lastName, int salary, String jobTitle, String company, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.company = company;
        this.city = city;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
