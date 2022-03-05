package lab_2;
import java.util.Scanner;
public class EligibilityCriteria {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths marks: ");
        int Maths = sc.nextInt();
        System.out.print("Enter Physics marks: ");
        int Physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int Chemistry = sc.nextInt();
        int trio = Maths + Physics + Chemistry;
        int two = Maths + Physics;

        if(Maths>=65 && Physics >= 55 && Chemistry >= 50){
            if(trio >= 190 || two >=140 ){
                System.out.println("You are eligible for the course");
            }
            else{
                System.out.println("You are not eligible for course");
            }
        }
        else{
            System.out.println("You are not eligible for course");
        }

    }

}
