package com.stormned.task_6_1;

public class Employee {
    public String firstName;
    public String lastName;
    public String position;
    public double salary;

    public Employee() {

    }

    public String toString () {
        return firstName + " - " + lastName + " - " + position + " - " + salary;
    }

    public void setFirstName (String a) {
        firstName = a;
    }

    public void setFullName (String b, String d) {
        firstName = b;
        lastName = d;
    }
    public Employee(String newFirstName, String newPosition) {
        this.firstName = newFirstName;
        this.position = newPosition;
    }

    public Employee(String newFirstName, String newLastName, String newPosition) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.position = newPosition;
    }
    public void setPosition(String p) {
        position = p;

    }
    public void setSalary(double s) {
        salary = s;
    }

    public String getFullName() {
        return firstName + " - " + lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo () {
        return firstName + " - " + lastName + " - " + position + " - " + salary;
    }

}