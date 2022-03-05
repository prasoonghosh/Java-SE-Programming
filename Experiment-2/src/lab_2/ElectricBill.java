package lab_2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = 0;
        System.out.println("Enter Customer id: ");
        String id = sc.nextLine();
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter unit consumption: ");
        float unit = sc.nextFloat();

        if(unit < 100){
            System.out.println("Minimum bill should be 100");
        }
        else if(100<unit && unit <=199){
            bill = unit * 1.20;
        }
        else if(200<=unit && unit <400){
            bill = unit * 1.50;
        }
        else if (400<=unit && unit < 600){
            bill = unit * 1.80;
        }
        else if(unit >= 600){
            bill = unit * 2.00;
        }

        if(bill >= 400){
            bill = bill * 0.15;
        }

        System.out.println("Customer id: "+id);
        System.out.println("Customer name: "+name);
        System.out.println("Total Unit Consumption: "+unit);
        System.out.println("Total bill: "+bill);
    }
}
