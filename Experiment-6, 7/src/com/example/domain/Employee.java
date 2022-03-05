package com.example.domain;

import java.text.NumberFormat;

public class Employee extends Object{
    private int empid;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empid, String name,String ssn, double salary) {
        this.empid = empid;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void raiseSalary(double increase) {
        this.salary = salary + increase;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Emp id: " + getEmpid()+
                "\nName: " + getName() +
                "\nSSN: "+ getSsn()+
                "\nSalary: "+ NumberFormat.getCurrencyInstance().format(getSalary());
    }


}