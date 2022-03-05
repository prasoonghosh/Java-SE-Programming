package com.example;
import java.util.ArrayList;

public class CustomerReport {
    public static void main(String[] args) {
        Customer c1=new Customer("Will","Smith",Branch.LA,500);
        Customer c2=new Customer("Bradley","Cooper",Branch.BOSTON,1060);
        Customer c3=new Customer("Jane","Simms",Branch.MUMBAI,200);
        Customer c4=new Customer("Owen","Bryant",Branch.BANGALORE,200);
        Customer c5=new Customer("Tim","Soley",Branch.LA,200);
        Customer c6=new Customer("Maria","Soley",Branch.BANGALORE,100);

        ArrayList<Customer> arr=new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        arr.add(c4);
        arr.add(c5);
        arr.add(c6);

        System.out.println("                    CUSTOMERS REPORT                    ");
        System.out.println("                    = = = = = = = = =                  ");

        for(Customer report:arr){
            System.out.println("Customer: "+report.getLastName()+","+report.getFirstName());
            System.out.println("Branch: "+report.branch+","+report.branch.getServiceLevel());
            System.out.println("Checking Account: current balance is "+report.getBalance());
            System.out.println("----------------------------");
        }

    }
}
