package com.stormned.task_6_3;

public class Employee {
    public String firstName;
    public String lastName;
    private Positions position;
    public double salary;

    public enum Positions {

        DIRECTOR(10),
        PROGRAMMER(8),
        QA(4);

        int bonus;

        Positions(int bonus) {
            this.bonus = bonus;
        }

        public int getBonus() {
            return bonus;
        }
    }

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
    public Employee(String newFirstName, Positions newPosition) {
        this.firstName = newFirstName;
        this.position = newPosition;
    }

    public Employee(String newFirstName, String newLastName, Positions newPosition) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.position = newPosition;
    }
    public void setPosition(Positions position) {
        this.position = position;

    }
    public void setSalary(double s) {
        salary = s;
    }

    public String getFullName() {
        return firstName + " - " + lastName;
    }

    public Positions getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo () {
        return firstName + " - " + lastName + " - " + position + " - " + salary;
    }

}