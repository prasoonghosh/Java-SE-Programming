package com.Example2;
import com.example.domain.*;
public class Employee_Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee_id(101);
        e.setEmployee_name("Prasoon Ghosh");
        e.setSocial_security_number("012-34-5678");
        e.setEmployee_salary(120_345.27);

        System.out.println("Employee id: "+e.getEmployee_id());
        System.out.println("Employee Name: "+e.getEmployee_name());
        System.out.println("Employee Social Security Number: "+e.getSocial_security_number());
        System.out.println("Employee Salary: "+e.getEmployee_salary());

    }
}
