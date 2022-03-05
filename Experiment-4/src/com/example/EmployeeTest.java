package com.example;
import com.example.domain.*;
public class EmployeeTest {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee_id(101);
        e.setEmployee_name("Jane Smith");
        e.setSsn("012-34-5678");
        e.setEmployee_salary(120_345.27);

        System.out.println("Employee id: "+e.getEmployee_id());
        System.out.println("Employee Name: "+e.getEmployee_name());
        System.out.println("Employee Social Security Number: "+e.getSsn());
        System.out.println("Employee Salary: "+e.getEmployee_salary());

    }
}
