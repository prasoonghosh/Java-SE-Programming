package com.example;

public class Employee {
    String Empname;
    String Job;
    String Department;
    double salary;

    public Employee(String Empname, String Job, String Department, double salary) {
        this.Empname = Empname;
        this.Job = Job;
        this.Department = Department;
        this.salary = salary;
    }
    public class Benefitshelper{
        private final double bonusRate = 0.02;
        private final double withholdingRate = 0.07;

        public double calcBonus(double salary) {
            return salary*bonusRate;
        }
        public double calcWithholding(double salary) {
            return salary*withholdingRate;
        }
    }

    Benefitshelper B = new Benefitshelper();
    public double getBonus() {
        return B.calcBonus(salary);
    }

    public double getWithholding() {
        return B.calcWithholding(salary);
    }

}
