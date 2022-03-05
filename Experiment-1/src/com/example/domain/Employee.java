package com.example.domain;

public class Employee {
    int Employee_id;
    String Employee_name;
    String Social_security_number;
    double Employee_salary;
    public Employee() {
        super();
    }
    public int getEmployee_id() {
        return Employee_id;
    }
    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }
    public String getEmployee_name() {
        return Employee_name;
    }
    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }
    public String getSocial_security_number() {
        return Social_security_number;
    }
    public void setSocial_security_number(String social_security_number) {
        Social_security_number = social_security_number;
    }
    public double getEmployee_salary() {
        return Employee_salary;
    }
    public void setEmployee_salary(double employee_salary) {
        Employee_salary = employee_salary;
    }
}
