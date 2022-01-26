package com.jimmy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var employee1 = new Employee(5000,20);

        int wage = employee1.calculateWage(20);
        System.out.println(wage);
        int wage1 = employee1.calculateWage();
        System.out.println(wage1);
        var employee2 = new Employee(10000);
        System.out.println(employee2.calculateWage(20));
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumsOfEmployees();
        employee1.
    }
}
