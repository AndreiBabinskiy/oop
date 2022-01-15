package com.stormned.task_6_1;

public class Main {

    public static void main(String[] args) {

        Employee director = new Employee();
        director.setFirstName("Andrey");
        director.setFullName("Andrey", "Iskov");
        director.setPosition("director");
        director.setSalary(100);

        Employee oneEmployee = new Employee();
        oneEmployee.setFirstName("Oleg");
        oneEmployee.setFullName("Oleg", "Petrov");
        oneEmployee.setPosition("qa");
        oneEmployee.setSalary(20);

        Employee twoEmployee = new Employee();
        twoEmployee.setFirstName("Petr");
        twoEmployee.setFullName("Petr", "Grigorovich");
        twoEmployee.setPosition("programmer");
        twoEmployee.setSalary(50);

        Employee threeEmployee = new Employee();
        threeEmployee.setFirstName("Rob");
        threeEmployee.setFullName("Rob", "Klinhamer");
        threeEmployee.setPosition("qa");
        threeEmployee.setSalary(30);

        Employee fourEmployee = new Employee();
        fourEmployee.setFirstName("Bil");
        fourEmployee.setFullName("Bil", "lobsterov");
        fourEmployee.setPosition("programmer");
        fourEmployee.setSalary(60);

        Employee fiveEmployee = new Employee();
        fiveEmployee.setFirstName("Bob");

        Employee sixEmployee = new Employee();
        sixEmployee.setFullName("Gleb", "Voleev");



        System.out.println(director.getEmployeeInfo());
        System.out.println(oneEmployee.getEmployeeInfo());
        System.out.println(twoEmployee.getEmployeeInfo());
        System.out.println(threeEmployee.getEmployeeInfo());
        System.out.println(fourEmployee.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(" Сотрудник компании : ");
        System.out.println(" ФИО : " + director.getFullName());
        System.out.println(" Заработная плата : " + director.getSalary());
        System.out.println(" Должность : " + director.getPosition());
        System.out.println("___________________________________");

        Employee director1 = new Employee();
        director1.setFirstName("Andrey");
        director1.setFullName("Andrey", "Bulba");
        director1.setPosition("director");
        director1.setSalary(100);


        Employee[] userArray = new Employee[5];
        userArray [0] = director;
        userArray [1] = oneEmployee;
        userArray [2] = twoEmployee;
        userArray [3] = threeEmployee;
        userArray [4] = fourEmployee;



        AddEmployee(userArray,director1);

        System.out.println("**********************************");


        for (Employee element : userArray) {
            System.out.println(" " + element.toString());
        }

        System.out.println("__________________");

        for (Employee a : userArray) {
            if ( a.getPosition() != "director") {
                System.out.println(" " + a.toString());
            }
        }
        System.out.println("__________________");
        double min = director.getSalary();
        for (Employee b : userArray) {
            if (b.getSalary() < min ) {
                min = b.getSalary();
            }
        }
        System.out.println(" Min salary employee = " + min);

        System.out.println("__________________");
        double max = oneEmployee.getSalary();
        for (Employee b : userArray) {
            if (b.getSalary() > max ) {
                max = b.getSalary();
            }
        }
        System.out.println(" Max salary employee = " + max);
    }

    public static  void AddEmployee (Employee[] userArray, Employee director1) {
        int employeeCount = 0;
        boolean isDirector = false;
        for (Employee user : userArray) {
            if (user != null) {
                employeeCount++;
                if("director".equals(user.getPosition())) {
                    isDirector = true;
                }
            }
        }
        if (employeeCount < 5) {
            if (isDirector) {
                System.out.println("Директор уже есть");
            } else {
                userArray[employeeCount] = director1;
                System.out.println("Сотрудник добавляется");
            }
        } else {
            System.out.println("Добавление сотрудника невозможно");
        }
    }
}
