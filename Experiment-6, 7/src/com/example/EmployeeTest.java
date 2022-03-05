package com.example;
import com.example.domain.*;
import com.example.business.*;
public class EmployeeTest {

    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: "+emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public  static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        printEmployee(emp);
        System.out.println("Stock Options: "+esp.grantStock(emp));
    }

    public static void main(String[] args) {
        EmployeeStockPlan esp = new EmployeeStockPlan();
        Engineer en = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
        Manager m = new Manager(207,"Barbara Johnson","054-12-2367",109_507.36,"US Marketing");
        Admin ad = new Admin(304,"Bill Munroe","108-23-6509",75_002.34);
        Director dr = new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);

        printEmployee(en,esp);
        System.out.println();
        printEmployee(m,esp);
        System.out.println();
        printEmployee(ad,esp);
        System.out.println();
        printEmployee(dr,esp);
        System.out.println();




    }

}
