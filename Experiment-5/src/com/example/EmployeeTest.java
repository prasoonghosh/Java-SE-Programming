package com.example;
import com.example.domain.*;
public class EmployeeTest {

    public static void main(String[] args) {
        Engineer en = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
        en.printEmployee();

        System.out.println();

        Manager m = new Manager(207,"Barbara Johnson","054-12-2367",109_507.36,"US Marketing");
        m.printEmployee();

        System.out.println();

        Admin ad = new Admin(304,"Bill Munroe","108-23-6509",75_002.34);
        ad.printEmployee();

        System.out.println();

        Director dr = new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);
        dr.printEmployee();
    }

}