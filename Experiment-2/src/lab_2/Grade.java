package lab_2;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade(E/V/G/A/F): ");
        String alpha = sc.next();
        switch (alpha.toUpperCase()){
            case "E":
                System.out.println("Excellent");
                break;
            case "V":
                System.out.println("Very Good");
                break;
            case "G":
                System.out.println("Good");
                break;
            case "A":
                System.out.println("Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Please enter right Grade");
        }

    }
}
