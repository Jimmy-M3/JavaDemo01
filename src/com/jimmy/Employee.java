package com.jimmy;

public class Employee {
    private int baseSalary;
    private int hourlyRate = 20;
    private int extraHours;
    public static int numberOfEmployees = 0;

    public Employee(int baseSalary,int extraHours){
        this.extraHours = extraHours;
        setBaseSalary(baseSalary);
        numberOfEmployees++;
    }

    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public int calculateWage(int extraHours){
        return getBaseSalary() + ( getHourlyRate() * extraHours );
    }

    public int calculateWage(){
        return getBaseSalary();
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <=0 )
            throw new IllegalArgumentException("The Base Salary should be more than 0 !");
        this.baseSalary = baseSalary;
    }

    private int getExtraHours() {
        return extraHours;
    }

    private void setExtraHours(int extraHours) {
        if (extraHours < 0)
            throw new IllegalArgumentException("The extra hours should not be less than 0!");
        this.extraHours = extraHours;
    }

    public static void printNumsOfEmployees(){
        System.out.println(numberOfEmployees);
    }
}
