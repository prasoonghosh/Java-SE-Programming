package lab_2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();
        System.out.println("Enter Operation(+,-,*,/): ");
        char c = sc.next().charAt(0);


        switch (c){
            case '+':
                System.out.print(a+""+c+""+b+"=");
                int sum = a+b;
                System.out.print(sum);
                break;
            case '-':
                System.out.print(a+""+c+""+b+"=");
                int sub = a-b;
                System.out.println(sub);
                break;
            case '*':
                System.out.print(a+""+c+""+b+"=");
                int multi = a*b;
                System.out.println(multi);
                break;
            case '/':
                System.out.print(a+""+c+""+b+"=");
                int division = a/b;
                System.out.println(division);
                break;
            default:
                System.out.println("Invalid operator!!!");
        }


    }
}
