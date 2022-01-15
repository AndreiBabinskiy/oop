package com.stormned.task_6_3;

public class Departament {
    Employee director;
    Employee[] staff;
    public int departamentSize;
    public String departamentName;


    public double calculateTotalSalary (Employee e) {
        double totalSalary = e.salary + (e.salary * e.getPosition().getBonus() / 100);
        return totalSalary;
    }

    public Departament () {

    }
    public String toStrings() {
        return director + departamentName + departamentName;
    }

    public Departament(int departamentSize, String departamentName) {
        this.departamentSize = departamentSize;
        this.departamentName = departamentName;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {

        if (this.director == null) {
            this.director = director;
        }

    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    public int getDepartamentSize() {
        return departamentSize;
    }

    public void setDepartamentSize(int departamentSize) {
        this.departamentSize = departamentSize;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }
}
