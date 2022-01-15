package com.stormned.task_6_3;

public class Main {

    public static void main(String[] args) {


        Departament departament = new Departament(5,"IT");
        Employee director = new Employee();
        director.setFirstName("Andrey");
        director.setFullName("Andrey", "Iskov");
        director.setPosition(Employee.Positions.DIRECTOR);
        director.setSalary(100);
        departament.setDirector(director);

        Employee director1 = new Employee();
        director1.setFirstName("Andrey");
        director1.setFullName("Andrey", "Bulba");
        director1.setPosition(Employee.Positions.DIRECTOR);
        director1.setSalary(30);
        departament.setDirector(director1);

        System.out.println("**********************************");
        System.out.println("Информация о директоре: " + departament.getDirector());
        System.out.println("**********************************");

        Employee oneEmployee = new Employee();
        oneEmployee.setFirstName("Oleg");
        oneEmployee.setFullName("Oleg", "Petrov");
        oneEmployee.setPosition(Employee.Positions.QA);
        oneEmployee.setSalary(20);

        Employee twoEmployee = new Employee();
        twoEmployee.setFirstName("Petr");
        twoEmployee.setFullName("Petr", "Grigorovich");
        twoEmployee.setPosition(Employee.Positions.PROGRAMMER);
        twoEmployee.setSalary(50);

        Employee threeEmployee = new Employee();
        threeEmployee.setFirstName("Rob");
        threeEmployee.setFullName("Rob", "Klinhamer");
        threeEmployee.setPosition(Employee.Positions.QA);
        threeEmployee.setSalary(30);

        Employee fourEmployee = new Employee();
        fourEmployee.setFirstName("Bil");
        fourEmployee.setFullName("Bil", "lobsterov");
        fourEmployee.setPosition(Employee.Positions.PROGRAMMER);
        fourEmployee.setSalary(60);

        Employee[] userArray = new Employee[5];
        userArray[0] = oneEmployee;
        userArray[1] = twoEmployee;

        Employee fiveEmployee = new Employee();
        fiveEmployee.setFirstName("Bob");
        fiveEmployee.setPosition(Employee.Positions.QA);
        fiveEmployee.setSalary(45);
        Employee sixEmployee = new Employee();
        sixEmployee.setFullName("Gleb", "Voleev");
        sixEmployee.setPosition(Employee.Positions.PROGRAMMER);
        sixEmployee.setSalary(60);

       AddEmployee(userArray, fiveEmployee);
       AddEmployee(userArray, sixEmployee);
       AddEmployee(userArray, director1);

        departament.setStaff(userArray);
        System.out.println("***********");

        for (Employee staff : departament.getStaff()) {
                System.out.println(" Сотрудники на предприятии: " + staff.toString());

        }
        System.out.println("*******************");

        double sumSalaryAllStaff = 0;
        for (Employee persona : departament.getStaff()) {
            sumSalaryAllStaff = sumSalaryAllStaff + departament.calculateTotalSalary(persona);
        }
        int sumBudget = 1000;
        double monthCount = sumBudget / (sumSalaryAllStaff + departament.calculateTotalSalary(director));
        System.out.println("Бюджета хватит на: " + monthCount + " месяцев");

    }


    public static  void AddEmployee (Employee[] userArray, Employee director1) {
        int employeeCount = 0;
        boolean isDirector = false;
        for (Employee user : userArray) {
            if (user != null) {
                employeeCount++;
                if(Employee.Positions.DIRECTOR.equals(user.getPosition())) {
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
