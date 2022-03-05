package com.example.domain;

public class Manager extends Employee{
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public Manager(int empid,String name, String ssn, double salary, String deptName) {
        super(empid, name, ssn, salary);

        this.deptName = deptName;
    }

}